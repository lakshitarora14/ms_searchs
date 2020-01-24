package com.coviam.search.repository;

import com.coviam.search.document.SearchDocument;

import java.util.List;

public interface SearchRepoCustom {
    List<SearchDocument> search(String keyword);
//    Page<SearchDocument> search2(String keyword);

}
