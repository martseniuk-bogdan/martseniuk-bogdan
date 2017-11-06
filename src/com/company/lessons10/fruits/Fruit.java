package com.company.lessons10.fruits;

public abstract class Fruit {
    private double weight;

    public Fruit() {
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double cost();
}
