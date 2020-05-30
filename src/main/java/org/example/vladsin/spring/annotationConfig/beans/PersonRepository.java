package org.example.vladsin.spring.annotationConfig.beans;

import org.example.vladsin.spring.annotationConfig.model.Person;

public interface PersonRepository {
    Person findPersonByName(String name);
}
