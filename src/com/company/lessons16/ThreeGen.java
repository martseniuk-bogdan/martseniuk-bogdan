package com.company.lessons16;

import com.company.lessons10.animal.Animal;
import com.company.lessons10.animal.Dog;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V extends Animal&Serializable, K extends Number> {
    T ob1;
    V ob2;
    K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void print() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
        System.out.println(ob3.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeGen<String, Animal, Integer> obj = new ThreeGen<>("text", new Dog(),22);
        obj.print();
        System.out.println(obj.getOb1());
        System.out.println(obj.getOb2());
        System.out.println(obj.getOb3());
    }
}
