package com.company.lessons4;

import java.util.Arrays;


public class ArrayInverterTest2 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{1, 2, 3, 4, 5, 6});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }
}
