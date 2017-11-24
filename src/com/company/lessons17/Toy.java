package com.company.lessons17;

public class Toy {
    private String name;
    private int Òostt;

    public Toy(String name, int Òostt) {
        this(name);
        this.Òostt = Òostt;
    }

    public Toy(String name) {
        this();
        this.name = name;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int get—ostt() {
        return Òostt;
    }

    public void set—ostt(int Òostt) {
        this.Òostt = Òostt;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", Òostt=" + Òostt +
                '}';
    }
}
