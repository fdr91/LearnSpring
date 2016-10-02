package com.springinaction.knights;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Fedor on 9/25/2016.
 */
public class SlayDragonQuest implements Quest {
    public static final Logger LOGGER = LoggerFactory.getLogger(SlayDragonQuest.class);

    public SlayDragonQuest() {

    }

    @Override
    public void embark() throws QuestException {
        LOGGER.info("Embark!");
    }
}
