package com.company.lessons10;

import com.company.lessons10.animal.*;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];
        animal[0] = new Dog("meat", "flat", true);
        animal[1] = new Cat("fish", "cat house", false);
        animal[2] = new Horse("grass", "zoo", "конь в пальто");

        for (Animal tmp : animal) {
            Vet.treatAnimal(tmp);
        }
    }
}
