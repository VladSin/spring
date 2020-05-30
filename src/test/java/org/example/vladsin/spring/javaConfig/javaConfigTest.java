package org.example.vladsin.spring.javaConfig;

import org.example.vladsin.spring.javaConfig.beans.impl.JavaConfig;
import org.example.vladsin.spring.javaConfig.collection.Collection;
import org.example.vladsin.spring.javaConfig.collection.CollectionConfig;
import org.example.vladsin.spring.javaConfig.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class javaConfigTest {
    @Test
    void getBeanTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        BeanConfig bean = context.getBean(BeanConfig.class);

        assertNotNull(bean);
        assertNotNull(bean.personRepository());
        System.out.println(bean);
        System.out.println(bean.personRepository());
    }

    @Test
    void name() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Test
    void collectionTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CollectionConfig.class);
        context.refresh();
        final Collection bean =  context.getBean(Collection.class);
        System.out.println(bean);
        context.close();
    }

    @Test
    void getPropFileForPersonTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Person.class);
        context.refresh();

        Person bean = context.getBean(Person.class);

        assertNotNull(bean);
        System.out.println(bean.getId() + " " + bean.getName() + " " + bean.getSurname());
    }
}
