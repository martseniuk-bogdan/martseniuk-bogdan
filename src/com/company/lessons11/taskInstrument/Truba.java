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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truba truba = (Truba) o;

        return Double.compare(truba.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diametr);
        return (int) (temp ^ (temp >>> 32));
    }
}
