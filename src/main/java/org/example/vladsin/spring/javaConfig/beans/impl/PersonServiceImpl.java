package org.example.vladsin.spring.javaConfig.beans.impl;

import org.example.vladsin.spring.annotationConfig.model.Person;
import org.example.vladsin.spring.javaConfig.beans.PersonRepository;
import org.example.vladsin.spring.javaConfig.beans.PersonService;

public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public String fullName(String name) {
        Person person = personRepository.findPersonByName(name);
        if(person != null){
            return (person.getName() + " " + person.getSurname());
        } else {
            return "The person is not found!";
        }
    }

}
