package com.coviam.search.repository;

import com.coviam.search.document.SearchDocument;
import org.springframework.data.domain.Page;

public interface SearchRepoCustom {
    Page<SearchDocument> search(String keyword);
//    Page<SearchDocument> search2(String keyword);

}
