package com.example.flashcard.service;

import com.example.flashcard.entity.Flashcard;
import com.example.flashcard.repo.FlashcardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlashcardService {

    @Autowired
    private FlashcardRepo flashcardRepo;

    // Retrieve all flashcards
    public Iterable<Flashcard> getAllFlashcards() {
        return flashcardRepo.findAll();
    }

    // Insert a new flashcard
    public Flashcard insertFlashcard(Flashcard flashcard) {
        return flashcardRepo.save(flashcard);
    }

    // Update an existing flashcard
    public Flashcard updateFlashcard(Flashcard flashcard) {
        Optional<Flashcard> optional = flashcardRepo.findById(flashcard.getId());
        if (optional.isPresent()) {
            Flashcard existingFlashcard = optional.get();
            existingFlashcard.setName(flashcard.getName());
            return flashcardRepo.save(existingFlashcard);
        } else {
            throw new RuntimeException("Flashcard not found with ID: " + flashcard.getId());
        }
    }

    // Delete a flashcard by ID
    public void deleteFlashcard(String id) {
        flashcardRepo.deleteById(id);
    }
}
