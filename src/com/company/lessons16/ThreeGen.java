package com.company.lessons16;

public class ThreeGen<T, V, K> {
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
        ThreeGen<Double, Integer, String> obj = new ThreeGen<>(33.2, 322, "text");
        obj.print();
        System.out.println(obj.getOb1());
        System.out.println(obj.getOb2());
        System.out.println(obj.getOb3());

    }
}
