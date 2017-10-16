package com.company.lessons2;

// однострочный комментарий

/*
Создать программу, в которой вывести на консоль литералы следующих видов:
    а) логический литерал
    б) строковый
    в) символьный
    г) целочисленный 2-й
    д) целочисленный 8-й
    е) целочисленный 10-й
    ж) целочисленный 16-й
    з) литерал типа float
    е) литерал типа double.
 */
public class Literals {

    public static void main(String[] args) {



        boolean bl = true;
        String st = "Stroka ";
        char ch = 'g';
        int in2 = 0b101;   //5
        int in8 = 017;     //15
        int in10 = 15;      //15
        int in16 = 0xF;    //15
        float fl = 5.5f;
        double db = 5.5d;
        System.out.println("логический литерал- " + bl);
        System.out.println("строковый- " + st);
        System.out.println("символьный- " + ch);
        System.out.println("целочисленный 2-й- " + in2);
        System.out.println("целочисленный 8-й- " + in8);
        System.out.println("целочисленный 10-й-  " + in10);
        System.out.println("целочисленный 16-й- " + in16);
        System.out.println("литерал типа float- " + fl);
        System.out.println("литерал типа double- " + db);
    }
}
