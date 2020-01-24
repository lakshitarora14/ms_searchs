package com.coviam.search.service.impl;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.repository.SearchRepoCustom;
import com.coviam.search.repository.SearchRepository;
import com.coviam.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

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

//    @Override
//    public List<SearchDocument> findByString(String name) {
//        return searchRepository.findByString(name);
//    }


    @Override
    public void deleteById(String id) {
        searchRepository.deleteById(id);
    }

//    @Override
//    public Page<SearchDocument> search2(String keyword) {
//        return searchRepoCustom.search2(keyword);
//    }
}
