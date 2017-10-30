package com.company.lessons10.flowers;

public abstract class Flower {
    private String country;
    private int days;

    public Flower() {
        country="UA";
        days=9;
    }

    public Flower(String country, int days) {
        this.country = country;
        this.days = days;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    abstract public int costFlowers();

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", days=" + days +
                '}';
    }
}
