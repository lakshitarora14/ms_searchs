package com.coviam.search.repository.repoimpl;

import com.coviam.search.document.SearchDocument;
import com.coviam.search.repository.SearchRepoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleFilterQuery;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Repository;

@Repository
public class SearchRepoCustomImpl implements SearchRepoCustom {

    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    public Page<SearchDocument> search(String keyword) {
        Query query = new SimpleQuery(Criteria.where("productName").is(keyword));
//        query.addFilterQuery(new SimpleFilterQuery(Criteria.where("productName").contains(keyword)));
        return solrTemplate.query("productCollection", query, SearchDocument.class);
    }
}
