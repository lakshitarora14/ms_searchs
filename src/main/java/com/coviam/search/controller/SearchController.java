package com.coviam.search.controller;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/save")
    public ResponseEntity<SearchDocument> save(@RequestBody SearchDocument searchDocument) {
        return new ResponseEntity<>(searchService.save(searchDocument), HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<SearchDocument>> search(@RequestParam("keyword")String keyword) {
        return new ResponseEntity<>(searchService.search(keyword), HttpStatus.OK);
    }



}
