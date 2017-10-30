package com.company.lessons10.flowers;

public class Tulips extends Flower {
    public static int count = 0;
    private int cost;

    public Tulips() {
        cost = 20;
        count++;
    }

    public Tulips(String country, int days, int cost) {
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
        return "Tulips{" +
                "cost=" + cost +
                '}';
    }
}
