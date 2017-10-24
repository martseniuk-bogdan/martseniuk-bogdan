package com.company.lessons8;

public class MainPhone {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setWeight(11.4);
        phone1.setModel("iPhone");
        phone1.setPhNumber(123456);
        Phone.show(phone1);

        System.out.println(phone2.toString());
        phone2.setWeight(145.5);
        phone2.setModel("iPhone");
        phone2.setPhNumber(4555);

        phone3.setWeight(145.5);
        phone3.setModel("iPhone");
        phone3.setPhNumber(1000000);
        System.out.println(phone3.toString());

        phone1.receiveCall("jobs");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("jonnie");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("joulie");
        System.out.println(phone3.getNumber());

        Phone phone4 = new Phone();
        Phone.show(phone4);
        phone4 = new Phone("nokia", 1222, 11.1);
        Phone.show(phone4);

        phone1.receiveCall("bogdan", 123321);
        phone1.sendMessage(1233, 333, 33333);

        System.out.println("Количество объектов- " + Phone.getCount());

    }
}
