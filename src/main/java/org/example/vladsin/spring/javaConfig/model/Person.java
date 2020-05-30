package org.example.vladsin.spring.javaConfig.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Configuration
@PropertySource(value = "bean.properties", encoding = "utf-8")
public class Person implements PersonName {

    private static Logger log = Logger.getLogger(String.valueOf(Person.class));

    @Value("${bean.id}")
    private Long id;
    @Value("${bean.name}")
    private String name;
    @Value("${bean.surname}")
    private String surname;


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
