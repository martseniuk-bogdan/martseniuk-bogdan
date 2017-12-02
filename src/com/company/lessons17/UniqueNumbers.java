package com.company.lessons17;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        String s = "1, 2, 3, 4, 4, 5";
        Set<Character> set = new TreeSet<>();
        for (Character tmp : s.toCharArray()) {
            set.add(tmp);
        }
        set.remove(' ');
        set.remove(',');
        System.out.println(s);
        System.out.println(set);
    }
}
