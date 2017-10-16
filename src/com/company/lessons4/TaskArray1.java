package com.company.lessons4;

import java.util.Arrays;

public class TaskArray1 {
    public static void main(String[] args) {
        weekDays();
        doubleArray();
        multidimensional();
        charArray();

    }

    public static void charArray() {
        char[][] array = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'h'}
        };
        System.out.println(Arrays.deepToString(array));
    }

    public static void multidimensional() {
        String[][] multidimensional = new String[3][6];
        char a = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                multidimensional[i][j] = a + "" + (j + 1);

            }
            a++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(multidimensional[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void doubleArray() {
        double[] doubleArr = {1.1, 2.1, 3.1, 4.1};
        System.out.println("first value from array- " + doubleArr[0]);
    }

    private static void weekDays() {
        String[] weekDays = new String[7];
        weekDays[0] = "понедельник";
        weekDays[1] = "вторник";
        weekDays[2] = "среда";
        weekDays[3] = "четверг";
        weekDays[4] = "пятница";
        weekDays[5] = "суббота";
        weekDays[6] = "воскресенье";
        System.out.println("last day= " + weekDays[6]);
    }
}
