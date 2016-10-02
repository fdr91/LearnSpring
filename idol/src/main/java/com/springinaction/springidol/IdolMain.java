package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fedor on 9/25/2016.
 */
public class IdolMain {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
        Performer performer1 = (Performer) context.getBean("kenny");
        performer1.perform();
        Performer performer2 = (Performer) context.getBean("hank");
        performer2.perform();
        Performer performer3 = (Performer) context.getBean("kenny2");
        performer3.perform();
    }
}
