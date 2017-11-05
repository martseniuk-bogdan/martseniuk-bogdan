package com.company.lessons12.clothes;

/**
 * Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 */
public abstract class Clothes {
    private ClothesSize size;
    private int cost;
    private String color;

    public Clothes() {
    }

    public Clothes(ClothesSize size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (cost != clothes.cost) return false;
        if (size != clothes.size) return false;
        return color.equals(clothes.color);
    }

    @Override
    public int hashCode() {
        int result = size.hashCode();
        result = 31 * result + cost;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
