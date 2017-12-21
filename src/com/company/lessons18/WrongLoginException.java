package com.company.lessons18;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
