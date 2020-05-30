package org.example.vladsin.spring.xmlConfig;

import org.example.vladsin.spring.xmlConfig.beans.PersonRepository;
import org.example.vladsin.spring.xmlConfig.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class xmlConfigTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    void xmlTest() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("beans.xml");
        context.refresh();

        PersonRepository repoBean = context.getBean(PersonRepository.class);
        BeanDefinition repoBeanDefinition = context.getBeanDefinition("repositoryXml");
        assertNotNull(repoBean);
        assertNotNull(repoBeanDefinition);
        System.out.println(repoBean.toString());
        System.out.println(repoBeanDefinition);
    }

    @Test
    void xmlPersonTest(){
        Person person = (Person) context.getBean("person");
        assertNotNull(person);
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
    }

    @Test
    void xmlInitDestroyTest(){
        Person person = (Person) context.getBean("person");
        assertNotNull(person);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
