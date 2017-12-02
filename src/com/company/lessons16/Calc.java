package com.company.lessons16;

public class Calc {
    public static void main(String[] args) {
        System.out.println(divide(22.1, 5.1));
        System.out.println(sum(-22.2, 22.2));
        System.out.println(multiply(0.1, 55.5f));
        System.out.println(subtraction(55L, 66.6d));
    }

    static <T extends Number, V extends Number> double sum(T first, V second) {
        return first.doubleValue() + second.doubleValue();
    }

    static <T extends Number, V extends Number> double multiply(T first, V second) {
        return first.doubleValue() * second.doubleValue();
    }

    static <T extends Number, V extends Number> double divide(T first, V second) {
        return first.doubleValue() / second.doubleValue();
    }

    static <T extends Number, V extends Number> double subtraction(T first, V second) {
        return first.doubleValue() - second.doubleValue();
    }
}
