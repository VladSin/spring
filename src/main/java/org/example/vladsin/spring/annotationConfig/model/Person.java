package org.example.vladsin.spring.annotationConfig.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;


public class Person implements PersonName{

    private static Logger log = Logger.getLogger(String.valueOf(Person.class));

    private Long id;
    private String name;
    private String surname;

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @PostConstruct
    public void init(){
        log.info("Init method worked");
    }
    @PreDestroy
    public void destroy(){
        log.info("Destroy method worked");
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void fullName() {
        String fullName = name + " " + surname;
        System.out.println(fullName);
    }
}
