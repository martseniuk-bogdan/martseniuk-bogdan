package com.company.lessons14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrom {
    public static void main(String[] args) {
        String string = "123456 1234321 112211";
        method(string);
    }

    public static void method(String string) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher match = pattern.matcher(string);
        while (match.find()) {
            if (match.group().equals(new StringBuilder(match.group()).reverse().toString())) {
                System.out.println(match.group() + " is a Palindrom");
            }
        }
    }
}