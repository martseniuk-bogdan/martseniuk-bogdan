package com.company.lessons5OOP;

import java.util.Arrays;

public class MinMaxToNewArray {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {8, 7, 6, 5, 4, 3, 2, 1},
                {5, 7, 4, 2, 8, 6, 4, 2},
                {2, 8, 67, 5, 7, -5, 6, 4},
                {1, 6, 4, 9, 6, 4, 2, 1},

        };
        int[][] arrMinMax = new int[5][2];

        for (int i = 0; i < 5; i++) {
            int min = 0;
            int max = 0;
            for (int j = 0; j < 8; j++) {
                if (array[i][j] > array[i][max]) {
                    max = j;
                } else if (array[i][j] < array[i][min]) {
                    min = j;
                }
            }
            arrMinMax[i][0] = array[i][max];
            arrMinMax[i][1] = array[i][min];
        }
        System.out.println("Исходный массив " + Arrays.deepToString(array));
        System.out.println("Массив максимальных и минимальных элементов " + Arrays.deepToString(arrMinMax));
    }
}
