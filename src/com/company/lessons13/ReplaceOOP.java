package com.company.lessons13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceOOP {
    public static void main(String[] args) {
        String string = "Java Swift aaaa object oriented programming. aaaaaaa Object oriented programming ";
        System.out.println(method(string));
    }

    private static String method(String string) {
        String str = "(o|O)bject oriented programming";
        Pattern pattern = Pattern.compile(str);
        Matcher match = pattern.matcher(string);
        while (match.find()) {
            string = match.replaceAll("OOP");
        }
        return string;
    }
}
