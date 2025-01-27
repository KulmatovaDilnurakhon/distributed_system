package com.example.flashcard.service;

import com.example.flashcard.entity.People;
import com.example.flashcard.repo.PeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepo peopleRepo;

    // Retrieve all people
    public Iterable<People> getAllPeople() {
        return peopleRepo.findAll();
    }

    // Insert a new person
    public People insertPerson(People person) {
        return peopleRepo.save(person);
    }

    // Update an existing person
    public People updatePerson(People person) {
        Optional<People> optional = peopleRepo.findById(person.getId());
        if (optional.isPresent()) {
            People existingPerson = optional.get();
            existingPerson.setName(person.getName());
            existingPerson.setGender(person.getGender());
            existingPerson.setDescription(person.getDescription());
            existingPerson.setFlashcardId(person.getFlashcardId());
            return peopleRepo.save(existingPerson);
        } else {
            throw new RuntimeException("Person not found with ID: " + person.getId());
        }
    }

    // Delete a person by ID
    public void deletePerson(String id) {
        peopleRepo.deleteById(id);
    }
}
