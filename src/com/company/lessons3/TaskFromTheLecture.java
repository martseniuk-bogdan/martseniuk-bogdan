package com.company.lessons3;

import java.util.Scanner;

/**
 * Задания, с лекции пятничной
 * а так-же часть домашнего задания
 */
public class TaskFromTheLecture {
    public static void main(String[] args) {
        while1();
        dowhile1();
        forchar();

        moreOrLess10();

        System.out.println("");
        System.out.println("day of week");
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("неверное число");
                break;
        }
    }

    public static void while1() {
        System.out.println("Работа с вайлом");
        int i = 1;
        while (i <= 10) {
            System.out.println("string" + i);
            i++;
        }
    }

    public static void dowhile1() {
        System.out.println("Работа с дувайлом");
        int n = 1;

        do {
            System.out.println("tick " + n);
            n++;
        } while (n < 101);
    }

    public static void forchar() {
        System.out.println("Работа с фором");
        char ch = 'h';
        for (int i = 0; i < 56; i++) {
            ch++;
            System.out.print(ch + " ");
        }
        System.out.println("\n");
    }

    public static void moreOrLess10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для проверки больше 10 или меньше 10");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value > 10) {
                System.out.println("больше десяти");
            } else {
                System.out.println("меньше десяти");
            }
        }
    }
}
