package com.company.lessons10.fruits;

public class Pear extends Fruit {
    static final public int COST = 20;
    static public double count = 0;

    public Pear() {
        count += this.getWeight();
    }

    public Pear(double weight) {
        super(weight);
        count += this.getWeight();
    }

    @Override
    public double cost() {
        return COST * this.getWeight();
    }
}
