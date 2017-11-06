package com.company.lessons13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        String regex = "\\w{4}\\s*\\d";
        String s = "Versions: Java  5, Java6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Versions " + matcher.group());
        }
    }
}
