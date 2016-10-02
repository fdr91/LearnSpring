package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fedor on 9/25/2016.
 */
public class ReplacementMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReplacementMain.class);
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("method-replacement.xml");
//      Method substitution
        perform(context, "harry");
        perform(context, "harryReplaced");
        perform(context, "stevie");
    }
    public static void perform(ApplicationContext context, String name) throws PerformanceException {
        Performer performer = (Performer) context.getBean(name);
        performer.perform();
    }
}
