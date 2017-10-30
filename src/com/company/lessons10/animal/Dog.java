package com.company.lessons10.animal;

public class Dog extends Animal {
    private boolean isTrained;

    public Dog() {
    }

    public Dog(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, boolean isTrained) {
        super(food, location);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Все что можно");
    }

    @Override
    public String toString() {
        return "Собака{" + super.toString() +
                "Тренирована?=" + isTrained +
                '}';
    }
}
