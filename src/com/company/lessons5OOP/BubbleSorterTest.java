package com.company.lessons5OOP;

import java.util.Arrays;

public class BubbleSorterTest {
    public static void main(String[] args) {
        int[][] data = {
                //{},
                //{1},
                //{0, 3, 2, 1},
                //{4, 3, 2, 1, 0},
                {3, 2, 1, 4, 5, 6},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSorter.underSort(arr);
            System.out.println(Arrays.toString(arr));
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
