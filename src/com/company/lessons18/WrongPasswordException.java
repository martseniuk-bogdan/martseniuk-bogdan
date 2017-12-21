package com.company.lessons18;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
