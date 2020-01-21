package com.coviam.search.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "SearchDocument")
public class SearchDocument {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

}
