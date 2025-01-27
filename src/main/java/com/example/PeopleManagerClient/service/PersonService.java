package com.example.PeopleManagerClient.service;

import com.example.PeopleManagerClient.model.Person;
import com.example.PeopleManagerClient.repositry.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // Create a new Person
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    // Get all persons
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Get person by ID
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    // Update person by ID
    public Person updatePerson(Long id, Person person) {
        if (personRepository.existsById(id)) {
            person.setId(id);
            return personRepository.save(person);
        } else {
            throw new RuntimeException("Person not found");
        }
    }

    // Delete person by ID
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
