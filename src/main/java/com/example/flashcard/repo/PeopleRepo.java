package com.example.flashcard.repo;

import com.example.flashcard.entity.People;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends ElasticsearchRepository<People, String> {
}
