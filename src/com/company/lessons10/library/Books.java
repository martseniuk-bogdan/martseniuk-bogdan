package com.company.lessons10.library;

public class Books {
    private String nameOfBoook;

    public Books() {
        nameOfBoook = "Swift Programming Language, Apple prod.";
    }

    public Books(String nameOfBoook) {
        this.nameOfBoook = nameOfBoook;
    }

    public String getNameOfBoook() {
        return nameOfBoook;
    }

    public void setNameOfBoook(String nameOfBoook) {
        this.nameOfBoook = nameOfBoook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameOfBoook='" + nameOfBoook + '\'' +
                '}';
    }
}
