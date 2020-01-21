package com.coviam.search.repository;

import com.coviam.search.document.SearchDocument;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends SolrCrudRepository<SearchDocument, String> {
}
