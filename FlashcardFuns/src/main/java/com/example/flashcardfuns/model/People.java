package com.example.flashcardfuns.model;

public class People {
    private String id;
    private String name;
    private String gender;
    private String description;
    private String flashcardId;

    public People(String id, String name, String gender, String description, String flashcardId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
        this.flashcardId = flashcardId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlashcardId() {
        return flashcardId;
    }

    public void setFlashcardId(String flashcardId) {
        this.flashcardId = flashcardId;
    }
}