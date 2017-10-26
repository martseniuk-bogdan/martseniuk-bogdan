package com.company.lessons10;

public class Circle extends Shape {
    private int x;
    private int y;
    private int rad;

    public Circle(String color) {
        super(color);
    }

    public Circle(int x, int y, int rad, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void draw() {
        System.out.println("Координаты центра круга- " + getX() + "." + getY() + " С радиусом- " + getRad() + " И цветом- " + getColor());
    }
}
