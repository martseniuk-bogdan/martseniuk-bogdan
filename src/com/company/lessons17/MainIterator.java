package com.company.lessons17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(301);
        arrayList.add(302);
        arrayList.add(303);
        arrayList.add(125);
        System.out.println("first " + arrayList);
        method(arrayList, arrayList2);
        System.out.println("second" + arrayList2);
    }

    private static void method(List<Integer> arrayList, List<Integer> arrayList2) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > 300) {
                iterator.remove();
                arrayList2.add(element);
            }
        }
    }
}
