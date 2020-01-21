package com.coviam.search.service.impl;

import com.coviam.search.repository.SearchRepository;
import com.coviam.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchRepository searchRepository;
}
