package com.company.lessons15.user;

public class UserLocal {
    private String login;
    private String password;

    public UserLocal(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("login is - " + login + ", password is- " + password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        UserLocal userLocal = new UserLocal("login", "12221");
        userLocal.createQuery();
    }
}
