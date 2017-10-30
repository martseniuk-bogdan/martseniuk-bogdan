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
    private double array[][];
    private int rows;
    private int columns;

    public Matrix() {
        rows = 3;
        columns = 3;
        array = new double[rows][columns];
    }

    public Matrix(int rows, int columns, double array[][]) {
        this.rows = rows;
        this.columns = columns;
        this.array = array;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new double[rows][columns];
    }

    public Matrix summa(Matrix secondArr) {
        Matrix result = new Matrix(3, 3);
        for (rows = 0; rows < 3; rows++) {
            for (columns = 0; columns < 3; columns++) {
                result.array[rows][columns] = this.array[rows][columns] + secondArr.array[rows][columns];
            }
        }
        return result;
    }

    public Matrix multiplyByTheNumber(double value) {
        Matrix result = new Matrix(4, 4);
        for (rows = 0; rows < 4; rows++) {
            for (columns = 0; columns < 4; columns++) {
                result.array[rows][columns] = this.array[rows][columns] * value;
            }
        }
        return result;
    }

    public Matrix multiplicationOfTwoMatrices(Matrix secondArr) {
        Matrix result = new Matrix(3, 3);
        for (int rows = 0; rows < 3; rows++) {
            for (int j = 0; j < 3; j++) {
                for (int r = 0; r < 3; r++) {
                    result.array[rows][j] += this.array[rows][r] * secondArr.array[r][j];
                }
            }
        }
        return result;
    }

    public void print(String a) {
        System.out.println(a);
        int countI = array.length;
        int countJ = array[0].length;
        for (int i = 0; i < countI; i++) {
            for (int j = 0; j < countJ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
