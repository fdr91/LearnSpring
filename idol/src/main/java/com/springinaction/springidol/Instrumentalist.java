package com.springinaction.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * Created by Fedor on 9/25/2016.
 */
//The annotation indicates that spring should configure objects
//of this class using bean "pianist" as pattern
@Configurable("pianist")
public class Instrumentalist implements Performer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Instrumentalist.class);
    public Instrumentalist() {
    }
    public void perform() throws PerformanceException {
        LOGGER.info("Playing " + song + " : ");
        instrument.play();
    }
    private String song;
    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}
