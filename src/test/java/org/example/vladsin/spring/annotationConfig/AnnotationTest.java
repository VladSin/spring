package org.example.vladsin.spring.annotationConfig;

import org.example.vladsin.spring.annotationConfig.beans.PersonRepository;
import org.example.vladsin.spring.annotationConfig.beans.PersonService;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonRepositoryImpl;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationTest {

    @Test
    void annotationTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PersonRepositoryImpl.class);
        context.register(PersonServiceImpl.class);
        context.refresh();

        PersonRepository beanRepository = context.getBean(PersonRepository.class);
        BeanDefinition beanDefinition = context.getBeanDefinition("personRepositoryImpl");
        assertNotNull(beanRepository);
        assertNotNull(beanDefinition);
        System.out.println(beanRepository);
        System.out.println(beanDefinition);
    }



    @Configuration
    static class BeanConfig{

        @Bean
        public PersonService personService(PersonRepository personRepository){
            return new PersonServiceImpl(personRepository);
        }

        @Bean
        public PersonRepository personRepository(){
            return new PersonRepositoryImpl();
        }
    }

    @Test
    void getBeanByConstructorTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectConstructor.class);
        context.refresh();

        AnnotationInjectConstructor bean = context.getBean(AnnotationInjectConstructor.class);

        assertNotNull(bean);
        assertNotNull(bean.getPersonRepository());

        System.out.println(bean);
        System.out.println(bean.getPersonRepository());
    }

    @Test
    void getBeanBySetterTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectSetter.class);
        context.refresh();

        AnnotationInjectSetter bean = context.getBean(AnnotationInjectSetter.class);

        assertNotNull(bean);
        assertNotNull(bean.getPersonRepository());

        System.out.println(bean);
        System.out.println(bean.getPersonRepository());
    }

    @Test
    void getBeanByFieldTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectField.class);
        context.refresh();

        AnnotationInjectField bean = context.getBean(AnnotationInjectField.class);

        assertNotNull(bean);
        assertNotNull(bean.getPersonRepository());

        System.out.println(bean);
        System.out.println(bean.getPersonRepository());
    }
}