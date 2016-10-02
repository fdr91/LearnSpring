package com.springinaction.springidol;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by Fedor on 9/25/2016.
 */
//@Component("auditorium")
public class Auditorium /*implements InitializingBean, DisposableBean */{

    private static final Logger LOGGER = LoggerFactory.getLogger(Auditorium.class);

    public void turnOnLights() {
        LOGGER.info("Turn on Lights");
    }
    public void turnOffLights() {
        LOGGER.info("Turn off Lights");
    }

//    @Override
//    public void destroy() throws Exception {
//        turnOffLights();
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        turnOnLights();
//    }
}
