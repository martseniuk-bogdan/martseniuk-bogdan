package com.company.lessons18;

public class WrongLoginException extends Exception {
    public WrongLoginException(String msg){
        super(msg);
    }

    public WrongLoginException() {
    }

    @Override
    public String toString() {
        return "WrongLoginException{}";
    }
}
