package com.company.lessons11.taskInstrument;

public class Baraban implements Instrument {
    private double size;

    public Baraban() {
        size = 21;
    }

    public Baraban(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("this is baraban, and it size is-" + getSize());
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "size=" + size +
                '}';
    }
}
