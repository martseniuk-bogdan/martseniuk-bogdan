package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar() {
        speed=300;
    }

    public SportCar(int speed) {
        this.speed = speed;
    }

    public SportCar(String marka, String carClass, Engine engine, Driver driver) {
        super(marka, carClass, engine, driver);
    }

    public SportCar(String marka, String carClass, Engine engine, Driver driver, int speed) {
        super(marka, carClass, engine, driver);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
