package com.company.lessons11;

import com.company.lessons11.taskPrintable.Book;
import com.company.lessons11.taskPrintable.Magazine;
import com.company.lessons11.taskPrintable.Printable;

public class MainPrintable {
    public static void main(String[] args) {
        Printable pr[]=new Printable[2];
        pr[0]=new Book();
        pr[1]=new Magazine();
        for (Printable tmp:pr){
            tmp.print();
        }
    }
}
