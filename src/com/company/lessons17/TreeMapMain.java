/*package com.company.lessons17;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        Map<String, Toy> tm = new TreeMap<>();
        tm.put("AAA", new Toy("AAA", 22));
        tm.put("CCC", new Toy("CCC", 22));
        tm.put("BBB", new Toy("BBB", 22));

        method1(tm);
        System.out.println("");
        method2(tm);
        System.out.println("");
        method3(tm);
    }

    /*
    Позволяет выводить и значения
     */
    /*private static void method3(Map<String, Toy> tm) {
        Collection<Toy> values = tm.values();
        for (Toy t : values) {
            System.out.println(t);
        }
    }

    /*
    Позволяет выводить и ключи
     */
   /* private static void method2(Map<String, Toy> tm) {
        Set<String> keys = tm.keySet();
        for (String s : keys) {
            System.out.println(s);
        }
    }

    /*
    Позволяет выводить и ключи и значения
     */
  /*  private static void method1(Map<String, Toy> tm) {
        Set<Map.Entry<String, Toy>> set = tm.entrySet();
        for (Map.Entry<String, Toy> tmp : set) {
            System.out.println(tmp.getValue());
            System.out.println(tmp.getKey());
        }
    }
}
*/