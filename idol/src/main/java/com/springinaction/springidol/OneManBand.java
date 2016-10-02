package com.springinaction.springidol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Fedor on 9/25/2016.
 */

public class OneManBand implements Performer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OneManBand.class);

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            LOGGER.info(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде
    } // отображения (Map)
}
