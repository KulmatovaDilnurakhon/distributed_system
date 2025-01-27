package com.example.flashcardfuns.controller;

import com.example.flashcardfuns.model.Flashcard;
import com.example.flashcardfuns.model.People;
import com.example.flashcardfuns.service.FlashcardManager;
import com.example.flashcardfuns.service.PeopleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashcardFuns {
    private final FlashcardManager flashcardManager = new FlashcardManager();
    private final PeopleManager peopleManager = new PeopleManager();

    @GetMapping("/getByFlashCardId")
    public FlashcardResponse getByFlashCardId(@RequestParam String cardId) {
        Flashcard flashcard = flashcardManager.getFlashcardById(cardId);
        if (flashcard == null) {
            throw new RuntimeException("Flashcard not found!");
        }

        List<People> people = peopleManager.getPeopleByFlashcardId(cardId);
        return new FlashcardResponse(flashcard.getId(), people);
    }
}