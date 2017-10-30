package com.company.lessons11.taskInstrument;

public class Gitara implements Instrument {
    private int countStrun;

    public Gitara() {
        countStrun = 7;
    }

    public Gitara(int countStrun) {
        this.countStrun = countStrun;
    }

    public int getCountStrun() {
        return countStrun;
    }

    public void setCountStrun(int countStrun) {
        this.countStrun = countStrun;
    }

    @Override
    public void play() {
        System.out.println("this is gitara, with-" + getCountStrun() + " strun");
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "countStrun=" + countStrun +
                '}';
    }
}
