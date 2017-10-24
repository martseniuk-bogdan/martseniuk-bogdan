package com.company.lessons8;

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("petrov pert", 55);
        p1.move();
        p2.talk();
    }
}
