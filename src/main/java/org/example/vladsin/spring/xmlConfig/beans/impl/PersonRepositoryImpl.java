package org.example.vladsin.spring.xmlConfig.beans.impl;

import org.example.vladsin.spring.xmlConfig.beans.PersonRepository;
import org.example.vladsin.spring.xmlConfig.model.Person;

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
