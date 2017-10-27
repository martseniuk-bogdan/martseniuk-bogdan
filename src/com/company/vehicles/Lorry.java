package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carryint;

    public Lorry() {
    }

    public Lorry(int carryint) {
        this.carryint = carryint;
    }

    public Lorry(String marka, String carClass, Engine engine, Driver driver) {
        super(marka, carClass, engine, driver);
    }

    public Lorry(String marka, String carClass, Engine engine, Driver driver, int carryint) {
        super(marka, carClass, engine, driver);
        this.carryint = carryint;
    }

    public int getCarryint() {
        return carryint;
    }

    public void setCarryint(int carryint) {
        this.carryint = carryint;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carryint=" + carryint +
                '}';
    }
}
