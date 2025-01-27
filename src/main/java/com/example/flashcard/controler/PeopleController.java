package com.example.flashcard.controller;

import com.example.flashcard.entity.People;
import com.example.flashcard.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public Iterable<People> getAllPeople() {
        return peopleService.getAllPeople();
    }

    @PostMapping
    public People createPerson(@RequestBody People person) {
        return peopleService.insertPerson(person);
    }

    @PutMapping
    public People updatePerson(@RequestBody People person) {
        return peopleService.updatePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        peopleService.deletePerson(id);
    }
}
