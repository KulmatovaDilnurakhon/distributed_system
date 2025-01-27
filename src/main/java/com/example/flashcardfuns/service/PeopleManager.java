package com.example.flashcardfuns.service;

import com.example.flashcardfuns.model.People;

import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private final List<People> peopleList = new ArrayList<>();

    public PeopleManager() {
        peopleList.add(new People("p1", "John Doe", "Male", "A sample person", "fc123"));
        peopleList.add(new People("p2", "Jane Smith", "Female", "Another sample person", "fc123"));
        peopleList.add(new People("p3", "Jim Brown", "Male", "Yet another sample person", "fc456"));
    }

    public List<People> getPeopleByFlashcardId(String flashcardId) {
        List<People> result = new ArrayList<>();
        for (People person : peopleList) {
            if (person.getFlashcardId().equals(flashcardId)) {
                result.add(person);
            }
        }
        return result;
    }
}