package com.company.lessons8;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * <p>
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 */
public class MainMatrix {
    public static void main(String[] args) {

        Matrix result;
        Matrix firstMatr = new Matrix(3, 3, new double[][]{{1, 2, 3}, {3, 2, 1}, {5, 5, 5}});
        firstMatr.print("first Arr");

        Matrix secondMatr = new Matrix(3, 3, new double[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        secondMatr.print("second Arr");

        result = firstMatr.summa(secondMatr);
        result.print("first Arr+second Arr=");

        result = firstMatr.multiplyByTheNumber(10.0);
        result.print("first Arr * 10.0");

        result = firstMatr.multiplicationOfTwoMatrices(secondMatr);
        result.print("first Arr * second Arr");


    }
}
