package com.company.lessons10.library;

public class Main {
    public static void main(String[] args) {
        Users user[] = new Users[3];
        user[0] = new Users("Marz", "Bogdan", 21, "KIT", "19.08.1997", 639013);
        user[2] = new Users();

        Books book[] = new Books[3];
        book[0] = new Books("Война и мир");
        book[1] = new Books();
        book[2] = new Books("Библия");

        Library library = new Library(user, book);
        library.takeBook(book);
        library.returnBook(book);
        library.returnBook(5);
    }
}
