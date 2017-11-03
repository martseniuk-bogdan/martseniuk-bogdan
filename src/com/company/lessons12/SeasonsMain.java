package com.company.lessons12;

public class SeasonsMain {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SUMMER;
        System.out.println(seasons);
        methodSwitch(seasons);

        methodAllSeasons();

        Seasons seasons2 = Seasons.valueOf("SUMMER");
        System.out.println(seasons2);
    }

    private static void methodAllSeasons() {
        Seasons[] seasons1 = Seasons.values();
        for (Seasons tmp : seasons1) {
            System.out.println(tmp);
            System.out.println(tmp.getDescription());
        }
        System.out.println("");
    }

    public static void methodSwitch(Seasons seasons) {
        switch (seasons) {
            case AUTUMN:
                System.out.println("I love Autumn");
                break;
            case SPRING:
                System.out.println("I love Spring");
                break;
            case SUMMER:
                System.out.println("I love Sumer");
                break;
            case WINTER:
                System.out.println("I love Winter");
                break;
        }
    }
}
