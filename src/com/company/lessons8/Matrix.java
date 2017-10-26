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
public class Matrix {
    private double arr[][];
    private int i;
    private int j;

    public Matrix() {
        i = 3;
        j = 3;
        arr = new double[i][j];
    }

    public Matrix(int i, int j, double arr[][]) {
        this.i = i;
        this.j = j;
        this.arr = arr;
    }

    public Matrix(int i, int j) {
        this.i = i;
        this.j = j;
        this.arr = new double[i][j];
    }

    Matrix summa(Matrix secondArr) {
        Matrix result = new Matrix(3, 3);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                result.arr[i][j] = this.arr[i][j] + secondArr.arr[i][j];
            }
        }
        return result;
    }

    Matrix multiplyByTheNumber(double value) {
        Matrix result = new Matrix(3, 3);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                result.arr[i][j] = this.arr[i][j] * value;
            }
        }
        return result;
    }

    Matrix multiplicationOfTwoMatrices(Matrix secondArr) {
        Matrix result = new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int r = 0; r < 3; r++) {
                    result.arr[i][j] += this.arr[i][r] * secondArr.arr[r][j];
                }
            }
        }
        return result;
    }

    public void print(String a) {
        System.out.println(a);
        int countI = arr.length;
        int countJ = arr[0].length;
        for (int i = 0; i < countI; i++) {
            for (int j = 0; j < countJ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
