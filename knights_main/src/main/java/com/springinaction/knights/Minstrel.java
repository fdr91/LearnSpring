package com.springinaction.knights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Minstrel {

    private static final Logger LOGGER = LoggerFactory.getLogger(Minstrel.class);

    public Minstrel() {
    }

    public void singBeforeQuest() { // Вызывается перед выполнением задания
        LOGGER.info("Fa la la; The knight is so brave !");
    }

    public void singAfterQuest() { // Вызывается после выполнения задания
        LOGGER.info("Tee hee he; The brave knight did embark on a quest !");
    }
}