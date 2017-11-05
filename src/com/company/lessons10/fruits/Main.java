package com.company.lessons10.fruits;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[6];
        fruits[0] = new Apple(2.2);
        fruits[1] = new Apple(3.3);
        fruits[2] = new Apricot(1.2);
        fruits[3] = new Apricot(2.5);
        fruits[4] = new Pear(10.5);
        fruits[5] = new Pear(20.2);

        int All = 0;
        for (Fruit tmp : fruits) {
            All += tmp.cost();
        }

        System.out.println("Apple- "+Apple.count*Apple.COST);
        System.out.println("Pear- "+Pear.count*Pear.COST);
        System.out.println("Apricot- "+Apricot.count*Apricot.COST);
        System.out.println("All " + All);
    }
}
