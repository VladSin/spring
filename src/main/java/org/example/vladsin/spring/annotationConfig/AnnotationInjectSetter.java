package org.example.vladsin.spring.annotationConfig;

import org.example.vladsin.spring.annotationConfig.beans.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AnnotationInjectSetter {

    private  PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public PersonRepository getPersonRepository() {
        return personRepository;
    }
}
