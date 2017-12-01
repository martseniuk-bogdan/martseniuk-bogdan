package com.company.lessons19;

import java.io.*;

public class Horse extends Animal implements Serializable {
    private Halter halter;
    private String name;

    public Horse() {
        name = "horse1";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Horse horse = new Horse();

        methodSerialable(horse);
        Horse horse2 = methodDes();
        System.out.println(horse2);
    }

    public static Horse methodDes() {
        Horse horse2;
        try (FileInputStream fis = new FileInputStream("src/com/company/lessons19/testSer.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new Horse();
        }
    }

    public static void methodSerialable(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("src/com/company/lessons19/testSer.txt"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
