package com.company.lessons17;

import java.util.Set;
import java.util.TreeSet;

/*
Напишите методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1, Set<?> set2), реализующих операции объединения и пересечения двух множеств.
Протестируйте работу этих методах на двух предварительно заполненных множествах.
(Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
 */
public class UnionIntersectMain {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(9);
        set2.add(0);

        print(set1, set2);
        intersect(set1, set2);
        union(set1, set2);
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new TreeSet<>();
        for (Integer tmp : set1) {
            if (set2.contains(tmp)) {
                set3.add(tmp);
            }
        }
        System.out.println("intersect- " + set3);
    }

    private static void union(Set<Integer> set1, Set set2) {
        set1.addAll(set2);
        System.out.println("union- " + set1);
    }

    private static void print(Set<Integer> set1, Set<Integer> set2) {
        System.out.println("basic 1- " + set1);
        System.out.println("basic 2- " + set2);
    }


}
