package com.company.lessons2;

import java.util.Scanner;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class SumOfTwoIntegers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        SumOfTwoIntegers n = new SumOfTwoIntegers();
        n.sumTwoNumbers(scanner);


    }

    public int input(Scanner scanner) {
        int tmp = 0;
        if (scanner.hasNextInt()) {
            tmp = scanner.nextInt();
        } else {
            System.out.println("Вы ввели некоректное число");
        }
        return tmp;
    }

    public void sumTwoNumbers(Scanner scanner) {
        int Value1 = 0;
        int Value2 = 0;
        int sum;
        System.out.println("Введите первое число: ");
        Value1 = input(scanner);
        System.out.println("Введите второе число: ");
        Value2 = input(scanner);
        sum = Value1 + Value2;
        System.out.println("Сумма двух чисел- " + sum);
    }
}
