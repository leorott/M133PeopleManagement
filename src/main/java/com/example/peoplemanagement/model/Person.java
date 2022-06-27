package com.example.peoplemanagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter private Integer id;

    @Getter @Setter private String name;
    @Getter @Setter private String surname;
    @Getter @Setter private String email;
}
