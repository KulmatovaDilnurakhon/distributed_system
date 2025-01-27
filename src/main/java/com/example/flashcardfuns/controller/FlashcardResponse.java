package com.example.flashcardfuns.controller;

import com.example.flashcardfuns.model.People;

import java.util.List;

public class FlashcardResponse {
    private String flashcardId;
    private List<People> peoples;

    public FlashcardResponse(String flashcardId, List<People> peoples) {
        this.flashcardId = flashcardId;
        this.peoples = peoples;
    }

    public String getFlashcardId() {
        return flashcardId;
    }

    public void setFlashcardId(String flashcardId) {
        this.flashcardId = flashcardId;
    }

    public List<People> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<People> peoples) {
        this.peoples = peoples;
    }
}