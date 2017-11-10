package com.company.lessons15.user;

import com.company.lessons11.taskPrintable.Printable;

public class MainPrintable {
    public static void main(String[] args) {
        Printable printable=new Printable() {
            @Override
            public void print() {
                System.out.println("smth text");
            }
        };
        printable.print();
    }
}
