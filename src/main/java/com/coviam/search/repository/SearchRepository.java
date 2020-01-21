package com.coviam.search.repository;

import com.coviam.search.entity.Search;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends CrudRepository<Search,String> {
}
