package com.coviam.search.service;

import com.coviam.search.document.SearchDocument;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SearchService {
    SearchDocument save(SearchDocument searchDocument);

    List<SearchDocument> search(String keyword);

//    List<SearchDocument> findByString(String name);

    void deleteById(String productId);

}
