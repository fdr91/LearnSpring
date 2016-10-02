package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Piano implements Instrument {

    private static final Logger LOGGER = LoggerFactory.getLogger(Piano.class);

    public Piano() {
    }
    public void play() {
        LOGGER.info("PLINK PLINK PLINK");
    }
}
