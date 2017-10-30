package com.company.lessons11.taskPrintable;

public class Magazine implements Printable {
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print magazine");
    }

    public static void printMagazine(Printable[] pr) {
        for (Printable tmp : pr) {
            if (tmp instanceof Magazine) {
                tmp.print();
                System.out.println(((Magazine) tmp).getName());
            }

        }
    }
}
