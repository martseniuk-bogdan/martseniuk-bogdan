package com.company.lessons10.animal;

public class Horse extends Animal {
    private String name;

    public Horse() {

    }
    public Horse(String name) {
        this.name = name;
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    public void eat() {
        System.out.println("трава");
    }

    @Override
    public String toString() {
        return "Лошадь{" + super.toString()+
                "имя='" + name + '\'' +
                '}';
    }
}
