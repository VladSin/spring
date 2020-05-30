package org.example.vladsin.spring.xmlConfig.beans.impl;

import org.example.vladsin.spring.xmlConfig.beans.PersonRepository;
import org.example.vladsin.spring.xmlConfig.beans.PersonService;
import org.example.vladsin.spring.xmlConfig.model.Person;

public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final String name;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
        this.name = "Vlad";
    }

    @Override
    public String fullName(String name) {
        Person person = personRepository.findPersonByName(name);
        if(person != null){
            String fullName = (person.getName() + " " + person.getSurname());
            return fullName;
        } else {
            return "The person is not found!";
        }
    }
}
