package com.example.flashcard.repo;

import com.example.flashcard.entity.Flashcard;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepo extends ElasticsearchRepository<Flashcard, String> {
}
