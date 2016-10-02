package com.springinaction.springidol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Fedor on 9/25/2016.
 */

public class OneManBand implements Performer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OneManBand.class);

    private Map<String, Instrument> instruments;
    private Properties instrumentsProp;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде
    } // отображения (Map)

    public void setInstrumentsProp(Properties instruments) {
        this.instrumentsProp = instruments; // Внедрение инструментов в виде
    } // Properties

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        if (instruments != null) {
            for (String key : instruments.keySet()) {
                LOGGER.info(key + ": ");
                Instrument instrument = instruments.get(key);
                instrument.play();
            }
        } else if (instrumentsProp != null) {
            for (String key : instrumentsProp.stringPropertyNames()) {
                LOGGER.info(key + ": " + instrumentsProp.getProperty(key));
            }
        } else {
            LOGGER.info("Have no instruments :(");
        }
    }
}
