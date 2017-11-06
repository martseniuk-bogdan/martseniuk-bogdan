package com.company.lessons13;

/**
 * a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * б) Распечатать последний символ строки. Используем метод String.charAt().
 * в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * д) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * е) Заменить все символы “а” на “о”.
 * ж) Преобразуйте строку к верхнему регистру.
 * з) Преобразуйте строку к нижнему регистру.
 * и) Вырезать строку Java c помощью метода String.substring. (Задание с урока).
 */
public class ILikeJava {
    public static void main(String[] args) {
        method("I Like Java");
    }

    private static void method(String string) {
        System.out.println(string.charAt(string.length() - 1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I Like"));
        System.out.println("Позиция подстроки ДЖАВА-" + string.indexOf("Java"));
        System.out.println(string.replace("a", "o"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(string.indexOf("Java"), string.lastIndexOf("a") + 1));
    }
}
