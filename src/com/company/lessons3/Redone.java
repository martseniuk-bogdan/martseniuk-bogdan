package com.company.lessons3;

import java.util.Scanner;

public class Redone {
    public static void main(String[] args) {
        method_If(args[0]);
        moreOrLess10();
        method_IfElseIf(args[0]);
        methodSwitch(args[0]);
        factorial();
    }

    private static void methodSwitch(String arg) {
        System.out.println("День недели через свитч");
        int n = Integer.parseInt(arg);
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
            case 7:
                System.out.println("выходной");
                break;

            default:
                System.out.println("неверное число");
                break;
        }
    }

    private static void method_If(String arg) {
        int n = Integer.parseInt(arg);
        if (n % 2 == 1) {
            System.out.println(n);
        }
    }

    private static void method_IfElseIf(String arg) {
        int n = Integer.parseInt(arg);
        System.out.println("День недели через ИфЭлсИф");
        if (n == 1) {
            System.out.println("Понедельник");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6 || n == 7) {
            System.out.println("Выходной");
        }
    }

    public static void moreOrLess10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для проверки больше 10 или меньше 10");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value >= 0 && value <= 10) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }

    public static void factorial(){
        int param=0 + (int) (Math.random() * 20); //если будет больше 20 - переполнение Лонг`а
        long fact=1;
        for (int i=1;i<param+1;i++){
            fact =fact*i;
        }
        System.out.println("factorial "+param+"= "+fact);

    }

}
