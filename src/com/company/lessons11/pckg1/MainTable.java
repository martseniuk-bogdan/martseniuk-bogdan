package com.company.lessons11.pckg1;

public class MainTable {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("!-----------------------------------------------------------------| private | default | protected | public|");
        System.out.println("| 1. | Один и тот же класс                                        |     +   |     +   |     +     |    +  |");
        System.out.println("| 2. | Подкласс, находящийся в том же пакете, что и суперкласс    |     -   |     +   |     +     |    +  |");
        System.out.println("| 3. | Класс из того же самого пакета, не являющийся подклассом.  |     -   |     +   |     +     |    +  |");
        System.out.println("| 4. | Подкласс, находящийся в другом пакете.                     |     -   |     -   |     +     |    +  |");
        System.out.println("| 5. | Класс из другого пакета, не являющийся подклассом данного. |     -   |     -   |     -     |    +  |");
        System.out.println("|_________________________________________________________________________________________________________|");
    }
}
