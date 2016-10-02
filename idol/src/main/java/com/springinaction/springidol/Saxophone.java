package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Saxophone implements Instrument {

    private static final Logger LOGGER = LoggerFactory.getLogger(Saxophone.class);

    public Saxophone() {
    }
    public void play() {
        LOGGER.info("TOOT TOOT TOOT");
    }
}
