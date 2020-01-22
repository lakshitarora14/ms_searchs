package com.coviam.search.controller;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.dto.SearchDto;
import com.coviam.search.service.SearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @KafkaListener(topics = "kafkaAdd",groupId = "group_id",containerFactory = "userConsumerFactory")
    public ResponseEntity<SearchDocument> save(SearchDto searchDto) {
        SearchDocument searchDocument = new SearchDocument();
        BeanUtils.copyProperties(searchDto,searchDocument);
        return new ResponseEntity<>(searchService.save(searchDocument), HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<SearchDocument>> search(@RequestParam("keyword")String keyword) {
        return new ResponseEntity<>(searchService.search(keyword), HttpStatus.OK);
    }



}
