package com.company.lessons16;

public class MinMaxMain {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        MinMax<Integer> minMax = new MinMax<>(array1);

        Double[] array2 = {1.1, 2.2, 3.3, 0.2};
        MinMax<Double> doubleMinMax = new MinMax<>(array2);

        System.out.println("max- " + minMax.max(array1));
        System.out.println("min- " + minMax.min(array1));

        System.out.println("max- " + doubleMinMax.max(array2));
        System.out.println("min- " + doubleMinMax.min(array2));
    }
}
