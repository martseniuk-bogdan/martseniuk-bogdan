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
    private static double pi = 3.1415;
    private double radius;

    public Circle() {
        radius = 15.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void areaC() {
        double area = getPi() * Math.pow(getRadius(), 2);
        System.out.println("Площадь= " + area);
    }

    public void longCircle() {
        double longCircle = 2 * getRadius() * getPi();
        System.out.println("Длина= " + longCircle);
    }

    public static void main(String[] args) {
        Circle cr = new Circle(10.0);
        Circle cr2 = new Circle();
        cr.areaC();
        cr2.longCircle();
    }
}
