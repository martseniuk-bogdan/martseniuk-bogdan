package com.company.lessons10.animal;

public class Cat extends Animal {
    private boolean isCastrated; //я просто не смог придумать ничего уникального для кота

    public Cat() {
    }

    public Cat(boolean isCastrated) {
        this.isCastrated = isCastrated;
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, boolean isCastrated) {
        super(food, location);
        this.isCastrated = isCastrated;
    }

    public boolean isCastrated() {
        return isCastrated;
    }

    public void setCastrated(boolean castrated) {
        isCastrated = castrated;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяв");
    }

    @Override
    public void eat() {
        System.out.println("рыба");
    }

    @Override
    public String toString() {
        return "Кот{" + super.toString() +
                "isCastrated=" + isCastrated +
                '}';
    }
}
