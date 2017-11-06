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

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", rad=" + rad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        if (y != circle.y) return false;
        return rad == circle.rad;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + rad;
        return result;
    }

    public void draw() {
        System.out.println("Координаты центра круга- " + getX() + "." + getY() + " С радиусом- " + getRad() + " И цветом- " + getColor());
    }
}
