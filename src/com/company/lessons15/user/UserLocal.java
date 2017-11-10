package com.company.lessons15.user;

public class UserLocal {
    private static String login;
    private static String password;

    public UserLocal() {
        login = "bogdan";
        password = "555555";
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("login is - " + login + ", password is- " + password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        UserLocal userLocal = new UserLocal();
        System.out.println(userLocal);

        UserLocal.createQuery();
    }
}
