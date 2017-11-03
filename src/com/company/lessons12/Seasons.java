package com.company.lessons12;

public enum Seasons {
    WINTER(-5), SPRING(10), SUMMER(40) {
        public String getDescription(){
            return "hot seasons";
        };
    }, AUTUMN(5);

    Seasons() {
    }

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public String getDescription(){
        return "seasons";
    }

    private int temperature;
}
