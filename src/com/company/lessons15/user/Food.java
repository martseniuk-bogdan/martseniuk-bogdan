package com.company.lessons15.user;

public class Food {
    public Food() {
    }

    public void prepare(Cookable cookable) {
        cookable.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("thms");
            }
        };
        food.prepare(cookable);
    }
}
