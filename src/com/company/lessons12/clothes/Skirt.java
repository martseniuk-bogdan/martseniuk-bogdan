package com.company.lessons12.clothes;

public class Skirt extends Clothes implements WomensClothing {
    public Skirt() {
    }

    public Skirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}
