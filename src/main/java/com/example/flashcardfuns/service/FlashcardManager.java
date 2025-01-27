package com.example.flashcardfuns.service;

import com.example.flashcardfuns.model.Flashcard;

import java.util.HashMap;
import java.util.Map;

public class FlashcardManager {
    private final Map<String, Flashcard> flashcards = new HashMap<>();

    public FlashcardManager() {
        flashcards.put("fc123", new Flashcard("fc123", "Sample Flashcard"));
        flashcards.put("fc456", new Flashcard("fc456", "Another Flashcard"));
    }

    public Flashcard getFlashcardById(String id) {
        return flashcards.get(id);
    }
}