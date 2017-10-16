package com.company.lessons3;

import java.util.Scanner;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
public class HW_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        smallerOfTheNumbers(scanner);

    }


    public static double input(Scanner scanner) {
        double tmp = 0;
        if (scanner.hasNextDouble()) {
            tmp = scanner.nextDouble();
            tmp = tmp < 0 ? -tmp : tmp;
        } else {
            System.out.println("Вы ввели некоректное число");
        }
        return tmp;
    }

    public static void smallerOfTheNumbers(Scanner scanner) {
        double Value1 = 0.0;
        double Value2 = 0.0;
        double Value3 = 0.0;

        System.out.println("Введите первое число: ");
        Value1 = input(scanner);
        System.out.println("Введите второе число: ");
        Value2 = input(scanner);
        System.out.println("Введите 3 число: ");
        Value3 = input(scanner);
        if (Value1 < Value2) {
            if (Value1 < Value3) {
                System.out.println("Наименьшее- " + Value1);
            } else {
                System.out.println("Наименьшее- " + Value3);
            }
        } else if (Value2 < Value3) {
            System.out.println("Наименьшее- " + Value2);
        } else {
            System.out.println("Наименьшее- " + Value3);
        }
    }
}
