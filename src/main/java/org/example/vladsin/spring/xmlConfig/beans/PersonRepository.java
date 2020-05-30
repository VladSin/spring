package org.example.vladsin.spring.xmlConfig.beans;

import org.example.vladsin.spring.xmlConfig.model.Person;

public interface PersonRepository {
    Person findPersonByName(String name);
}
