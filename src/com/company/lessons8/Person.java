package com.company.lessons8;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 */
public class Person {
    private String fullName;
    private int age;

    public Person() {
        setFullName("Щербинина Елизавета");
        setAge(19);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Идет- " + getFullName());
    }

    public void talk() {
        System.out.println("Говорит- " + getFullName() + " ему- " + getAge() + "  лет.");
    }

    @Override
    public String toString() {
        return String.format("Персона- %s , и ей %d лет!", fullName, age);
    }
}
