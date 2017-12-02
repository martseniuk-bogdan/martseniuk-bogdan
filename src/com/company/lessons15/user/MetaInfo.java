package com.company.lessons15.user;

import com.company.lessons10.animal.Animal;
import com.company.lessons12.Seasons;

public class MetaInfo {
    public static void main(String[] args) {
        print(Cookable.class);
        print(Animal.class);
        print(Seasons.class);
    }

    public static void print(Class classs) {
        System.out.println(classs.getName());
        System.out.println(classs.getPackage());
        System.out.println(classs.isEnum());
        System.out.println(classs.isInterface());
        System.out.println();
    }
}
