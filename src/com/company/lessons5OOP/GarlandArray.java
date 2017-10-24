package com.company.lessons5OOP;

import java.util.Arrays;
import java.util.Scanner;

public class GarlandArray {
    public static void main(String[] args) {
        boolean i = false;

        while (!i) {
            int[] arr = {0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1,};
            title("Мигающая гирлянда --1", "Бегущая строка --2", "Проверка первой лампы --3", "Вывести гирлянду --4", "EXIT --5");
            int param = selectMethod("Ведите цифру от 1 до 5");
            switch (param) {
                case 1:
                    flashing(arr);
                    break;
                case 2:
                    ticker(arr);
                    break;
                case 3:
                    firstPosition(arr);
                    break;
                case 4:
                    showArr(arr);
                    break;
                case 5:
                    i = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы ввели некорректное число или ввели 5 и вышли из программы");
            }
        }
    }

    private static void title(String x, String x2, String x3, String x4, String x5) {
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
    }

    private static int selectMethod(String x) {
        int param = 0;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            param = scanner.nextInt();
        } else {
            System.out.println("Вы ввели некоректное число");
        }
        return param;
    }

    private static void firstPosition(int arr[]) {
        String res = arr[arr.length - 1] == 1 ? "on" : "off";
        System.out.println("first lamp is " + res);
    }

    private static void showArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }


    private static void flashing(int arr[]) {
        int param = selectMethod("Ведите количество миганий гирлянды");
        showArr(arr);
        for (int j = 0; j < param; j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.abs(arr[i] - 1);

            }
            showArr(arr);
        }
    }

    private static void ticker(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
            showArr(arr);
        }
    }
}
