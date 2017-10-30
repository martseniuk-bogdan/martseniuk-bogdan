package com.company.lessons8;

import java.util.Scanner;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */
public class Circle {
    private static double PI = 3.1415;
    private double radius;

    public Circle() {
        radius = 15.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return getPI() * Math.pow(getRadius(), 2);
    }

    public double length() {
        return 2 * getRadius() * getPI();
    }

    public static void main(String[] args) {
        Circle cr = new Circle(10.0);
        Circle cr2 = new Circle();
        System.out.println("Area= " + cr.area());
        System.out.println("Length" + cr2.length());
    }
}
