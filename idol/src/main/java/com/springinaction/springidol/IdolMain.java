package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanIsAbstractException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fedor on 9/25/2016.
 */
public class IdolMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(IdolMain.class);
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-idol.xml");
        perform(context, "poeticDuke");
        perform(context, "kenny");
        perform(context, "hank");
        perform(context, "hankProps");
        perform(context, "hankNull");
        perform(context, "kenny2");
        perform(context, "selectiveInstrumentalist");
        LOGGER.info("Multiplier val: " + ((Multiplier)context.getBean("multiplier")).getMultiplier());

//      Abstract beans and inheritance
//      The class of the ascendants are still Instrumentalist
        perform(context, "saxophonist1");
        perform(context, "saxophonist2");
//        What if we try to get an abstract bean
        try {
            Performer performer = (Performer) context.getBean("baseSaxophonist");
            performer.perform();
        } catch (BeanIsAbstractException e) {
            //EMPTY
        }
//      These beans have similar bean-parent but in java they're of different classes
        perform(context, "taylor");
        perform(context, "stevie");

        testConfigurable();
    }
    public static void perform(ApplicationContext context, String name) throws PerformanceException {
        Performer performer = (Performer) context.getBean(name);
        performer.perform();
    }

    public static void testConfigurable() throws PerformanceException {
        Instrumentalist configurable = new Instrumentalist();
        configurable.perform();
    }
}
