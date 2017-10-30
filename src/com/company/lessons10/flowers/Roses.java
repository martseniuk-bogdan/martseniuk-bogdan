package com.company.lessons10.flowers;

/**
 * Создать класс "Flower", который содержит переменные страна производитель и срок хранения в днях.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Суперкласс "Flower" должен содержать абстрактный метод определяющий стоимость цветка, этот метод переопределить в классах наследниках.
 * Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа. Также подсчитать количество проданных цветов (используем статический метод).
 */
public class Roses extends Flower {
    public static int count = 0;
    private int cost;

    public Roses() {
        cost = 50;
        count++;
    }

    public Roses(String country, int days, int cost) {
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

    @Override
    public String toString() {
        return "Roses{" +
                "cost=" + cost +
                '}';
    }
}
