package org.example.vladsin.spring.javaConfig;

import org.example.vladsin.spring.annotationConfig.beans.PersonRepository;
import org.example.vladsin.spring.annotationConfig.beans.PersonService;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonRepositoryImpl;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public PersonService personService(PersonRepository personRepository){
        return new PersonServiceImpl(personRepository);
    }

    @Bean
    public PersonRepository personRepository(){
        return new PersonRepositoryImpl();
    }
}
