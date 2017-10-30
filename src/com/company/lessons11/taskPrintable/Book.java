package com.company.lessons11.taskPrintable;

public class Book implements Printable {
    private String nameBook;

    public Book() {
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void print() {
        System.out.println("print book");
    }
    public static void printBook(Printable[] pr) {
        for (Printable tmp : pr) {
            if (tmp instanceof Book){
                tmp.print();
                System.out.println(((Book)tmp).getNameBook() );
            }
        }
    }
}
