package com.company.lessons10.fruits;

public class Apricot extends Fruit {
    static final public int COST = 20;
    static public double count = 0;

    public Apricot() {
        count += this.getWeight();
    }

    public Apricot(double weight) {
        super(weight);
        count += this.getWeight();
    }

    @Override
    public double cost() {
        return COST * this.getWeight();
    }
}
