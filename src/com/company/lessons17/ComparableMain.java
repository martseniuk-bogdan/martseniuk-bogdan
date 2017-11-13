package com.company.lessons17;

import com.company.lessons8.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>();
        set.add(new Person("Marz", 20));
        set.add(new Person("Sasha", 21));
        set.add(new Person("Liza", 19));
        for (Person tmp : set) {
            System.out.println(tmp);
        }
    }
}
