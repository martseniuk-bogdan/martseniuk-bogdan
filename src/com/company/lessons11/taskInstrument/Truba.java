package com.company.lessons11.taskInstrument;

public class Truba implements Instrument {
    private double diametr;

    public Truba() {
        diametr = 32;
    }

    public Truba(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("play truba with diametr-" + getDiametr());
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diametr=" + diametr +
                '}';
    }
}
