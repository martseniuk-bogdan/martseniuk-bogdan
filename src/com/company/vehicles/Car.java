package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
 * "Поворот направо" или "Поворот налево".
 * А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */
public class Car {
    private String marka;
    private String carClass;
    private Engine engine;
    private Driver driver;

    public Car() {
        this.engine = new Engine();
        this.driver = new Driver();
        marka = "bmw m5";
        carClass = "S class";
    }

    public Car(String marka, String carClass, Engine engine, Driver driver) {
        this.marka = marka;
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public void start() {
        System.out.println("go go go");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void turnRight() {
        System.out.println("turnRight");
    }

    public void turnLeft() {
        System.out.println("turnLeft");
    }

    public void printInfo() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.printInfo();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();

        SportCar sportCar = new SportCar();
        System.out.println(sportCar);

        Lorry lorry = new Lorry();
        System.out.println(lorry);
    }
}
