package com.company.lessons12.clothes;

public class Tshirt extends Clothes implements MensClothing,WomensClothing{
    public Tshirt() {
    }

    public Tshirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Tshirt{}"+super.toString();
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
