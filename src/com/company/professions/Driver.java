package com.company.professions;

import com.company.lessons8.Person;

public class Driver extends Person {
    private int expirience;

    public Driver() {
    }

    public Driver(int expirience) {
        this.expirience = expirience;
    }

    public Driver(String fullName, int age) {
        super(fullName, age);
    }

    public Driver(String fullName, int age, int expirience) {
        super(fullName, age);
        this.expirience = expirience;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "expirience=" + expirience +
                '}';
    }
}
