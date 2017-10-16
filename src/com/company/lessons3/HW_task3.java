package com.company.lessons3;

/**
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Используйте цикл for, пример. Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class HW_task3 {
    public static void main(String[] args) {
        int i = 0;
        double sym = 0.0;
        int len = args.length;
        for (i = 0; i < len; i++) {
            double tmp = Double.parseDouble(args[i]);
            sym += tmp;
        }
        double avg = sym / len;
        System.out.println("Среднее значение из передаваемых в программу- " + avg);

    }
}
