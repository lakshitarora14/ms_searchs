package com.coviam.search.service;

import com.coviam.search.document.SearchDocument;
import org.springframework.data.domain.Page;

public interface SearchService {
    SearchDocument save(SearchDocument searchDocument);

    Page<SearchDocument> search(String keyword);
}
