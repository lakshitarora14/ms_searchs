package com.coviam.search.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.HashMap;
@Getter
@Setter
@SolrDocument(collection = "productCollection")
public class SearchDocument {

    @Id
    @Indexed(name = "productId", type = "String")
    private String productId;
    @Indexed(name = "productName", type = "String")
    private String productName;
    @Indexed(name = "genre", type = "String")
    private String genre;
    @Indexed(name = "rating", type = "String")
    private String rating;
    @Indexed(name = "description", type = "String")
    private String description;
    @Indexed(name = "author", type = "String")
    private String author;
    @Indexed(name = "url", type = "String")
    private String url;
    @Indexed(name = "isbn", type = "String")
    private String isbn;
    @Indexed(name = "price", type = "String")
    private String price;

}
