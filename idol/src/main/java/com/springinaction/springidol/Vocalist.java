package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Vocalist implements Performer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Vocalist.class);
    private String song;

    public Vocalist() {}

    public void perform() throws PerformanceException {
        LOGGER.info("Singing " + song + "");
    }

    public void setSong(String song) { this.song = song;}
    public String getSong() {
        return song;
    }
}
