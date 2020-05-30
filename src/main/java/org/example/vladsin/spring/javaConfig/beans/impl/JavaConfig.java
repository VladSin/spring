package org.example.vladsin.spring.javaConfig.beans.impl;

import org.example.vladsin.spring.javaConfig.beans.PersonRepository;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean("rep-1")
    public PersonRepositoryImpl personRepository(){
        return new PersonRepositoryImpl();
    }

    @Bean("rep-2")
    public PersonRepositoryImpl personRepository2(){
        return new PersonRepositoryImpl();
    }
}
