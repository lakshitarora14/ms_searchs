package com.coviam.search.repository;

import com.coviam.search.document.SearchDocument;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends SolrCrudRepository<SearchDocument, String> {
//
//        @Query("productName:*?0*")
//        List<SearchDocument> findByString(String name);
//        @Query("(productName:*?0*)^10 OR (description:*?0*)^5 OR (author:*?0*)^7 OR (isbn:*?0*)")



}
