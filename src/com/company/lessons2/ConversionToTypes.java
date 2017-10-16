package com.company.lessons2;

/**
 * Создать программу,
 * в которой последовательно прописать преобразования всех совместимых примитивных типов друг к другу.
 * Преобразование для каждого типа вынесите в отдельный метод.
 */
public class ConversionToTypes {
    public static void main(String[] args) {

        fromByte();
        fromChar();
        fromDouble();
        fromFloat();
        fromInt();
        fromLong();
        fromShort();
        url();
    }

    public static void fromByte() {
        byte bt = 10;
        short sh = bt;
        int in = bt;
        long lg = bt;
        char ch = (char) bt;
        float fl = bt;
        double db = bt;

    }

    public static void fromShort() {
        short sh = 10;
        byte bt = (byte) sh;
        int in = sh;
        long lg = sh;
        char ch = (char) sh;
        float fl = sh;
        double db = sh;

    }

    public static void fromChar() {
        char ch = '5';
        byte bt = (byte) ch;
        short sh = (short) ch;
        int in = ch;
        long lg = ch;
        float fl = ch;
        double db = ch;
    }

    public static void fromInt() {
        int in = 10;
        byte bt = (byte) in;
        short sh = (short) in;
        char ch = (char) in;
        long lg = in;
        float fl = in;
        double db = in;
    }

    public static void fromLong() {
        long lg = 10;
        byte bt = (byte) lg;
        short sh = (short) lg;
        char ch = (char) lg;
        int in = (int) lg;
        float fl = lg;
        double db = lg;
    }

    public static void fromFloat() {
        float fl = 10.0f;
        byte bt = (byte) fl;
        short sh = (short) fl;
        char ch = (char) fl;
        int in = (int) fl;
        long lg = (long) fl;
        double db = fl;
    }

    public static void fromDouble() {
        double db = 10.0;
        byte bt = (byte) db;
        short sh = (short) db;
        char ch = (char) db;
        int in = (int) db;
        long lg = (long) db;
        float fl = (float) db;
    }

    public static void url() {
        System.out.println("Ссылка на табличку приведения типов " + "https://docs.google.com/spreadsheets/d/1ktG9pOeZAmh1BaR5-4lZV1sXcVt0fpBVDwZ1kFb0fwQ/edit?usp=sharing");
    }

}
