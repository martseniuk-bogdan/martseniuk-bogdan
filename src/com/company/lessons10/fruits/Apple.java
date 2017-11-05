package com.company.lessons10.fruits;

public class Apple extends Fruit {
    static final public int COST = 15;
    static public double count = 0;

    public Apple() {
        count += this.getWeight();
    }

    public Apple(double weight) {
        super(weight);
        count += this.getWeight();
    }

    @Override
    public double cost() {
        return COST * this.getWeight();
    }
}
