package org.example.vladsin.spring.annotationConfig;

import org.example.vladsin.spring.annotationConfig.beans.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationInjectField {

    @Autowired
    private  PersonRepository personRepository;

    public PersonRepository getPersonRepository() {
        return personRepository;
    }
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}

