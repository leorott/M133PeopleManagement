package com.example.peoplemanagement.repository;

import com.example.peoplemanagement.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}