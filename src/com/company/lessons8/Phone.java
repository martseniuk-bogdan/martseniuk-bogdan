package com.company.lessons8;

public class Phone {
    private String model;
    private double weight;
    private int phNumber;
    private static int count = 0;

    Phone() {
        model = "samsung";
        phNumber = 123456;
        weight = 11.1;
        count++;
    }

    Phone(String m, int ph, double w) {
        this();
        model = m;
        phNumber = ph;
        weight = w;
    }

    public static int getCount() {
        return count;
    }

    public int getPhNumber() {

        return phNumber;
    }

    public void setPhNumber(int phNumber) {
        this.phNumber = phNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        count++;
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", phNumber=" + phNumber +
                '}';
    }

    public static void show(Phone obj) {
        System.out.println("model " + obj.model);
        System.out.println("number " + obj.phNumber);
        System.out.println("weight " + obj.weight);
    }

    void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    void receiveCall(String name, int phNumber) {
        System.out.println("Name- " + name + " Number- " + phNumber);
    }

    int getNumber() {
        return phNumber;
    }

    void sendMessage(int... phNumber) {
        for (int a : phNumber) {
            System.out.println("send to " + a);
        }
    }
}
