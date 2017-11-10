package com.company.lessons15.user;

public class UserStatic {
    private static String login = "login my";
    private static String password = "passw 123";

    static class Query {
        void printToLog() {
            System.out.println("login- " + login + ", password- " + password);
        }
    }

    public static void main(String[] args) {
        Query query = new Query();
        query.printToLog();
    }
}
