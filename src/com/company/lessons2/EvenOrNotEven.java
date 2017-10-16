package com.company.lessons2;

import java.util.Scanner;

/**
 * Создать программу,
 * которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
public class EvenOrNotEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Ведите одно целое число ");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();

        } else {
            System.out.println("Вы ввели не целое число");

        }
        if (i % 2 == 1) {
            System.out.println("Не четное");
        } else {
            System.out.println("Четное");
        }
    }
}
