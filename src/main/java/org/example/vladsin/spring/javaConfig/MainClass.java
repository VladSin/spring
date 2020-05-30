package org.example.vladsin.spring.javaConfig;

import org.example.vladsin.spring.javaConfig.beans.PersonRepository;
import org.example.vladsin.spring.javaConfig.beans.impl.PersonRepositoryImpl;
import org.example.vladsin.spring.javaConfig.beans.impl.PersonServiceImpl;
import org.example.vladsin.spring.javaConfig.beans.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainClass.class);
        context.refresh();

        final PersonServiceImpl bean = context.getBean(PersonServiceImpl.class);
        System.out.println(bean.fullName("Vlad"));
    }

    @Bean
    public PersonService personService(PersonRepository personRepository){
        return new PersonServiceImpl(personRepository);
    }

    @Bean
    public PersonRepository personRepository(){
        return new PersonRepositoryImpl();
    }
}
