package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Cymbal implements Instrument {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cymbal.class);

    public Cymbal() {
    }
    public void play() {
        LOGGER.info("CYM CYM CYM");
    }
}
