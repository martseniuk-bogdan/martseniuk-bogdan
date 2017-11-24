package com.company.lessons18;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String msg){
        super(msg);
    }

    public WrongPasswordException() {
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
