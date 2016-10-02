package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Fedor on 9/25/2016.
 */
public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }

    public Juggler(@Value("${duke.beanBags}")int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
