package com.example.PeopleManagerClient.repositry;

import com.example.PeopleManagerClient.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // You can add custom queries here if needed, or use standard CRUD operations
}