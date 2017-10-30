package com.company.lessons9;

public class Recurs {
    public static void main(String[] args) {
        System.out.println(method(10, 15));
        System.out.println(method(15, 10));
    }

    public static String method(int valueA, int valueB) {
        String result = "";
        if (valueA > valueB) {
            result = " " + valueA + method(valueA - 1, valueB);
        } else if (valueA < valueB) {
            result = " " + valueA + method(valueA + 1, valueB);
        } else {
            return " " + valueA;
        }
        return result;
    }
}
