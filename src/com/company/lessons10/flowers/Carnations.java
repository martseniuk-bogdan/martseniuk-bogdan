package com.company.lessons10.flowers;

public class Carnations extends Flower {
    public static int count = 0;
    private int cost;

    public Carnations() {
        cost = 15;
        count++;
    }

    public Carnations(String country, int days, int cost) {
        super(country, days);
        this.cost = cost;
        count++;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int costFlowers() {
        return cost;
    }

    @Override
    public String toString() {
        return "Carnations{" +
                "cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carnations that = (Carnations) o;

        return cost == that.cost;
    }

    @Override
    public int hashCode() {
        return cost;
    }
}
