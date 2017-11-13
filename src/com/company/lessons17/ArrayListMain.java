package com.company.lessons17;

import com.company.lessons10.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Dog> arrayList1 = new ArrayList<>();
        arrayList1.add(new Dog("meat", "house", true));
        arrayList1.add(new Dog("fish", "house", false));
        arrayList1.add(new Dog("corn", "house", false));

        for (Dog tmp : arrayList1) {
            System.out.println(tmp);
        }
    }
}
