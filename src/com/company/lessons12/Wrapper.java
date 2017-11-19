package com.company.lessons12;

public class Wrapper {
    public static void main(String[] args) {
        System.out.println("https://docs.google.com/spreadsheets/d/1ktG9pOeZAmh1BaR5-4lZV1sXcVt0fpBVDwZ1kFb0fwQ/edit#gid=0");
        methodByte();
        methodShort();
        methodInt();
        methodLong();
        methodFloat();
        methodDouble();
    }

    public static void methodByte() {
        System.out.println("");
        Byte b1 = Byte.valueOf((byte) 12);
        Byte b2 = Byte.valueOf("127");
        byte b3 = Byte.parseByte("2");
        Byte b4 = 13;
        print(b1, b2, b3, b4);
        String s = Byte.toString(b3);
        System.out.println(s);
    }

    public static void methodShort() {
        System.out.println("");
        Short s1 = Short.valueOf((short) 15);
        Short s2 = Short.valueOf("3443");
        short s3 = Short.parseShort("222");
        Short s4 = 134;
        print(s1, s2, s3, s4);
        String s = Short.toString(s3);
        System.out.println(s);
    }

    public static void methodInt() {
        System.out.println("");
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf("34343");
        int i3 = Integer.parseInt("222");
        Integer i4 = 134;
        print(i1, i2, i3, i4);
        String s = Integer.toString(i3);
        System.out.println(s);
    }

    public static void methodLong() {
        System.out.println("");
        Long l1 = Long.valueOf(1L);
        Long l2 = Long.valueOf("11511111233");
        long l3 = Long.parseLong("451");
        Long l4 = 134L;
        print(l1, l2, l3, l4);
        String s = Long.toString(l3);
        System.out.println(s);
    }

    public static void methodFloat() {
        System.out.println("");
        Float f1 = Float.valueOf(1f);
        Float f2 = Float.valueOf("3.11111111");
        float f3 = Float.parseFloat("451");
        Float f4 = 134.0F;
        print(f1, f2, f3, f4);
        String s = Float.toString(f3);
        System.out.println(s);
    }

    public static void methodDouble() {
        System.out.println("");
        Double d1 = Double.valueOf(1);
        Double d2 = Double.valueOf("3.1415");
        double d3 = Double.parseDouble("451.4");
        Double d4 = 134.583;
        print(d1, d2, d3, d4);
        String s = Double.toString(d3);
        System.out.println(s);
    }

    public static void print(Number b1, Number b2, Number b3, Number b4) {
        System.out.println("valueOf- " + b1 + " " + b2);
        System.out.println("парсим- " + b3);
        System.out.println("автоупаковка- " + b4);
        System.out.println("int " + b2.intValue());
        System.out.println("short " + b2.shortValue());
        System.out.println("long " + b2.longValue());
        System.out.println("byte " + b2.byteValue());
        System.out.println("float " + b2.floatValue());
        System.out.println("double " + b2.doubleValue());
    }
}
