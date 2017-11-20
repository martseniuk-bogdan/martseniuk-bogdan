package com.company.lessons17;

import com.company.lessons10.animal.Dog;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        Deque<Dog> dogDeque = new ArrayDeque<>();
        dogDeque.offer(new Dog("meat", "house", true));
        dogDeque.offer(new Dog("milk", "house", false));
        dogDeque.offer(new Dog("meat", "garden", false));

        while (!dogDeque.isEmpty()) {
            System.out.println(dogDeque.poll());
        }
    }
}
