package org.example.vladsin.spring.javaConfig.beans.impl;

import org.example.vladsin.spring.annotationConfig.model.Person;
import org.example.vladsin.spring.javaConfig.beans.PersonRepository;


public class PersonRepositoryImpl implements PersonRepository {

    @Override
    public Person findPersonByName(String name) {
        if(name.equals("Vlad")){
            return new Person(1L, "Vlad", "Sinitsa");
        } else {
            throw new IllegalArgumentException("The person is not found!");
        }
    }
}
