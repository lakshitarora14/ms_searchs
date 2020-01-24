package com.coviam.search.controller;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.dto.SearchDto;
import com.coviam.search.repository.SearchRepository;
import com.coviam.search.service.SearchService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import com.coviam.search.dto.SearchDto;
//import org.springframework.kafka.annotation.KafkaListener;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;
    @Autowired
    SearchRepository searchRepository;


//Save files without Kafka
//    @PostMapping("/save")
//    public ResponseEntity<SearchDocument> save(@RequestBody SearchDocument searchDocument) {
//        return new ResponseEntity<>(searchService.save(searchDocument), HttpStatus.CREATED);
//    }

    @KafkaListener(topics = "kafkaAdd",groupId = "group_id")
    public ResponseEntity<SearchDocument> save(String merchantData) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        SearchDocument searchDocument = new SearchDocument();
        searchDocument = objectMapper.readValue(merchantData,SearchDocument.class);
        return new ResponseEntity<>(searchService.save(searchDocument), HttpStatus.CREATED);
    }


    @GetMapping("/search")
    public ResponseEntity<Page<SearchDocument>> search(@RequestParam("keyword")String keyword) {

        return new ResponseEntity<>(searchService.search(keyword), HttpStatus.OK);
    }

//    @GetMapping("/search2")
//    public ResponseEntity<Page<SearchDocument>> search2(@RequestParam("keyword")String keyword) {
//
//        return new ResponseEntity<>(searchService.search2(keyword), HttpStatus.OK);
//    }



//    @DeleteMapping("/delete/{id}")
//    public  void deleteById(@PathVariable(value = "id") String id){
//            searchService.deleteById(id);
//    }
//




}
