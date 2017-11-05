package com.company.lessons12.clothes;

public class Pants extends Clothes implements MensClothing, WomensClothing {
    public Pants() {
    }

    public Pants(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Pants{}"+super.toString();
    }

    @Override
    public void dressMen() {
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}
