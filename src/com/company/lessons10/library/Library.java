package com.company.lessons10.library;

import java.util.Arrays;

public class Library {
    private Users[] users;
    private Books[] books;

    public Library() {
    }

    public Library(Users[] users, Books[] books) {
        this.users = users;
        this.books = books;
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    public void takeBook(int count) {
        System.out.println(count + " книг взял читатель");
    }

    public void takeBook(String... nameOfBoook) {
        for (String tmp : nameOfBoook) {
            System.out.println("взял книгу- " + tmp);
        }
    }

    public void takeBook(Books books[]) {
        for (Books tmp : books) {
            System.out.println("взял книгу- " + tmp);
        }
    }

    public void returnBook(int count) {
        System.out.println("вернул пользователь книг- " + count);
    }

    public void returnBook(String... nameOfBooks) {
        for (String tmp : nameOfBooks) {
            System.out.println("вернул книгу- " + nameOfBooks);
        }
    }

    public void returnBook(Books books[]) {
        for (Books tmp : books) {
            System.out.println("вернул книгу- " + tmp);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "users=" + Arrays.toString(users) +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}

