package com.coviam.search.repository.repoimpl;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.repository.SearchRepoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

import static org.springframework.data.solr.core.query.Query.Operator.OR;

@Repository
public class SearchRepoCustomImpl implements SearchRepoCustom {

    @Autowired
    private SolrTemplate solrTemplate;

//    @Override
//    public Page<SearchDocument> search2(String keyword) {
//        String[] split = keyword.split("\\s+");
//        Query query = new SimpleQuery();
//        query.setRequestHandler("browse");
//        for (String keyword1 : Arrays.asList(split)) {
//            query.addCriteria(new Criteria("productName").boost(10).is(keyword)
//            .or(new Criteria("description").boost(5).is(keyword))
//                    .or(new Criteria("genre").boost(7).is(keyword))
//                    .or(new Criteria("author").boost(8).is(keyword)));
//
//        }
//        return solrTemplate.query("productCollection",query, SearchDocument.class);
//    }
    @Override
    public Page<SearchDocument> search(String keyword) {
        SimpleQuery solrQuery = new SimpleQuery(keyword);
        solrQuery.setRequestHandler("/browse");
       return solrTemplate.query("productCollection",solrQuery,SearchDocument.class);
    }







}
