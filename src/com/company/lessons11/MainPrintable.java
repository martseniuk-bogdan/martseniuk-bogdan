package com.company.lessons11;

import com.company.lessons11.taskPrintable.Book;
import com.company.lessons11.taskPrintable.Magazine;
import com.company.lessons11.taskPrintable.Printable;

public class MainPrintable {
    public static void main(String[] args) {
        Printable printables[] = new Printable[3];
        printables[0] = new Book("book1");
        printables[1] = new Magazine("magazine1");
        printables[2]=new Book ("book2");
        for (Printable tmp : printables) {
            tmp.print();
        }
        Book.printBook(printables);
        Magazine.printMagazine(printables);
    }
}
