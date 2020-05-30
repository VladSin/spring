package org.example.vladsin.spring.xmlConfig;

import org.example.vladsin.spring.xmlConfig.model.PersonName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        while (true){
            context.getBean(PersonName.class).fullName();
            System.out.println();
            Thread.sleep(5000);
        }
//        Person person = (Person) context.getBean("person");
//        System.out.println(person.toString());
//        ((ClassPathXmlApplicationContext) context).close();
    }
}
