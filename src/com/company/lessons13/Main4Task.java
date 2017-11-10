package com.company.lessons13;

/**
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */
public class Main4Task {
    public static void main(String[] args) {
        System.out.println(method("Practice"));
        System.out.println(method("code"));
        System.out.println(method("string"));
    }

    public static String method(String string) {
        String string2;
        string2 = string.substring((string.length() / 2) - 1, (string.length() / 2) + 1);
        return string2;
    }
}
