package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Guitar implements Instrument {

    private static final Logger LOGGER = LoggerFactory.getLogger(Guitar.class);

    public Guitar() {
    }
    public void play() {
        LOGGER.info("DIN DIN DIN");
    }
}
