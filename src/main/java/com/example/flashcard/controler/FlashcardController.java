package com.example.flashcard.controller;

import com.example.flashcard.entity.Flashcard;
import com.example.flashcard.service.FlashcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flashcards")
public class FlashcardController {

    @Autowired
    private FlashcardService flashcardService;

    @GetMapping
    public Iterable<Flashcard> getAllFlashcards() {
        return flashcardService.getAllFlashcards();
    }

    @PostMapping
    public Flashcard createFlashcard(@RequestBody Flashcard flashcard) {
        return flashcardService.insertFlashcard(flashcard);
    }

    @PutMapping
    public Flashcard updateFlashcard(@RequestBody Flashcard flashcard) {
        return flashcardService.updateFlashcard(flashcard);
    }

    @DeleteMapping("/{id}")
    public void deleteFlashcard(@PathVariable String id) {
        flashcardService.deleteFlashcard(id);
    }
}
