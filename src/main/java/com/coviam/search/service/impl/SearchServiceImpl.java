package com.coviam.search.service.impl;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.repository.SearchRepoCustom;
import com.coviam.search.repository.SearchRepository;
import com.coviam.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchRepository searchRepository;

    @Autowired
    private SearchRepoCustom searchRepoCustom;

    @Override
    public SearchDocument save(SearchDocument searchDocument) {
        return searchRepository.save(searchDocument);
    }

    @Override
    public Page<SearchDocument> search(String keyword) {
        return searchRepoCustom.search(keyword);
    }
}
