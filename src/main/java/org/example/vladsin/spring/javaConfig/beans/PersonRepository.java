package org.example.vladsin.spring.javaConfig.beans;

import org.example.vladsin.spring.annotationConfig.model.Person;

public interface PersonRepository {
    Person findPersonByName(String name);
}
