package com.springinaction.springidol;

/**
 * Created by Fedor on 10/2/2016.
 */
public abstract class InstrumentalistWithInsertMethod implements Performer {
    private String song;
    public InstrumentalistWithInsertMethod() {}

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        getInstrument().play(); // Используется внедряемый метод
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument(); // Внедряемый метод
}
