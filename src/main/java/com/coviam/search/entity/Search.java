package com.coviam.search.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.HashMap;

@Entity
@Getter
@Setter
public class Search {

    String product_id;
    String product_name;
    String genre;
    String rating;
    HashMap<String,String> attributes;
    String description;
    String author;
    String url;
    String isbn;
    String price;

}