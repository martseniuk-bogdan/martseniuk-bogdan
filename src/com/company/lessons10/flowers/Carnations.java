package com.company.lessons10.flowers;

public class Carnations extends Flower {
    public static int count = 0;
    private int cost;

    public Carnations() {
        cost=15;
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
}
