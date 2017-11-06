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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (days != flower.days) return false;
        return country != null ? country.equals(flower.country) : flower.country == null;
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + days;
        return result;
    }
}
