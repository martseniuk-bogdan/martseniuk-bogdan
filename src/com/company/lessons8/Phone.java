package com.company.lessons8;

public class Phone {
    private String model;
    private double weight;
    private int number;
    private static int count = 0;

    public Phone() {
        model = "Samsung";
        number = 123456;
        weight = 11.1;
        count++;
    }

    public Phone(String m, int ph, double w) {
        this();
        model = m;
        number = ph;
        weight = w;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", phNumber=" + number +
                '}';
    }

    public static void show(Phone obj) {
        System.out.println("model " + obj.model);
        System.out.println("number " + obj.number);
        System.out.println("weight " + obj.weight);
    }

    public void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    public void receiveCall(String name, int phNumber) {
        System.out.println("Name- " + name + " Number- " + phNumber);
    }

    public void sendMessage(int... phNumber) {
        for (int a : phNumber) {
            System.out.println("send to " + a);
        }
    }
    protected void finalize() {
        System.out.println("Goodbye phone");
        System.out.println(Phone.getCount());
    }
}
