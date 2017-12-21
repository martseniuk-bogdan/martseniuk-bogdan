package com.company.lessons17.toy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TMap {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Car", new Toy("Car", 50));
        map.put("Doll", new Toy("Doll", 50));
        map.put("Ball", new Toy("Ball", 22));

        printMap(map);
        printKeys(map);
        printValues(map);

    }
    public static void printValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy t : values) {
            System.out.println(t);
        }
    }

    public static void printKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String s : keys) {
            System.out.println(s);
        }
    }

    public static void printMap(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> m : set) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
