package com.company.lessons10;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек.
 * Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
 * Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */
public class ShapeAbsMain {
    public static void main(String[] args) {
        Shape[] sh = new Shape[2];
        sh[0] = new Circle(10, 10, 10, "red");
        sh[1] = new Rectangle(5, 5, 10, 10, "blue");
        for (Shape sh1 : sh) {
            sh1.draw();
        }
        Circle c1=new Circle(10,10,10,"red");
        Circle c2=new Circle(10,10,10,"red");
        System.out.println(c1.equals(c2));
    }
}
