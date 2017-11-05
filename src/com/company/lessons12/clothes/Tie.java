package com.company.lessons12.clothes;

public class Tie extends Clothes implements MensClothing {
    public Tie() {
    }

    public Tie(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }

    @Override
    public void dressMen() {
        System.out.println(this);
    }
}
