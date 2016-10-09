package com.conditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Fedor on 10/2/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class ConditionalTest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    //We set System property to make MagicExistsCondition work
    static {
        System.setProperty("magic", "1");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void test() {
        MagicBean magicBean = applicationContext.getBean(MagicBean.class);
        System.out.println(magicBean.toString());
    }
}
