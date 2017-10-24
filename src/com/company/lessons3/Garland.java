package com.company.lessons3;

import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        boolean i = false;
        while (!i) {
            title("Мигающая гирлянда --1", "Бегущая строка --2", "Проверка первой лампы --3", "Вывести гирлянду --4", "EXIT --5");
            int param = selectMethod("Ведите цифру от 1 до 5");
            switch (param) {
                case 1:
                    flashing();
                    break;
                case 2:
                    ticker();
                    break;
                case 3:
                    firstPosition();
                    break;
                case 4:
                    show();
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

    private static void firstPosition() {
        int value = 0b0110011;
        String v1 = Integer.toBinaryString(value);
        System.out.print("У числа- " + v1);
        if ((value & 1) == 1) {
            System.out.println(" первая лампа включена");
        } else {
            System.out.println(" первая лампа выключена");
        }
    }


    private static void flashing() {
        int param = selectMethod("Ведите количество миганий гирлянды");
        int value = 236587987;
        for (int i = 0; i < param; i++) {
            System.out.println("0000" + Integer.toBinaryString(value));
            System.out.println(Integer.toBinaryString(~value));
        }
    }

    private static void ticker() {
        System.out.println("бегущая строка");
        int a = 236587987;
        System.out.println("");
        for (int i = 1; i < 10; i++) {
            System.out.println(Integer.toBinaryString(a >> i));
        }
    }

    public static void show() {
        int value = 0b0101010101010101;
        System.out.println(Integer.toBinaryString(value));
    }
}
