package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Harmonica implements Instrument {

    private static final Logger LOGGER = LoggerFactory.getLogger(Harmonica.class);

    public Harmonica() {
    }
    public void play() {
        LOGGER.info("HARM HARM HARM ");
    }
}
