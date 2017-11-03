package com.company.lessons12;

public class Wrapper {
    public static void main(String[] args) {
        Double ld = new Double(111.11);
        Double ld2 = new Double("222.22");
        Double d3 = Double.valueOf(333.33);
        Double d4 = Double.valueOf("100011");
        double d5 = Double.parseDouble("555.5");
        System.out.println("1- " + ld + " 2- " + ld2);
        System.out.println("3- " + d3 + " 4- " + d4);
        System.out.println("Parse-" + d5);
        int i = ld.intValue();
        short sh = ld.shortValue();
        byte bt = ld.byteValue();
        float fl = ld.floatValue();
        long lg = ld.longValue();
        double db = ld.doubleValue();
        String str = Double.toString(66666.6);
        System.out.println(i + "\n" + sh + "\n" + bt + "\n" + fl + "\n" + lg + "\n" + db);
        System.out.println(str);

        Double boxing=45565.5;
        System.out.println(boxing);
    }
}
