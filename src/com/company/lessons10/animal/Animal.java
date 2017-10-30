package com.company.lessons10.animal;

public abstract class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    abstract public void makeNoise();

    abstract public void eat();

    public void sleep() {
    }

    @Override
    public String toString() {
        return "Животное{" +
                "пища='" + food + '\'' +
                ", где живет='" + location + '\'' +
                '}';
    }
}
