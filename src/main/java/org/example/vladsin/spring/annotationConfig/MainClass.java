package org.example.vladsin.spring.annotationConfig;

import org.example.vladsin.spring.annotationConfig.beans.PersonService;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonRepositoryImpl;
import org.example.vladsin.spring.annotationConfig.beans.impl.PersonServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PersonRepositoryImpl.class);
        context.register(PersonServiceImpl.class);
        context.refresh();

        PersonService beanService = context.getBean(PersonService.class);
        System.out.println(beanService.fullName("Vlad"));
    }
}
