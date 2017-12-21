package com.company.lessons18;

import java.util.regex.Pattern;

public class ExpMain {
    public static void main(String[] args) {
        try {
            System.out.println(identifications("login1", "passw", "passw"));
            System.out.println(identifications("login1222222222222222222222", "passw", "passw"));
            System.out.println(identifications("login1", "passw1", "passw"));
            System.out.println(identifications("login1", "passw12222222222222222222222222222222", "passw"));
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }

    }

    public static boolean identifications(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        try {
            if (!Pattern.compile("\\w{1,20}").matcher(login).matches()) {
                throw new WrongLoginException("login isn`t correct");
            }
            if (!password.equals(confirmPassword) || !Pattern.compile("\\w{1,20}").matcher(password).matches()) {
                throw new WrongPasswordException("password isn`t correct");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.print(e.getMessage() + " ");
            return false;
        }
        System.out.print("Login: " + login + " Password: " + password + " ");
        return true;
    }
}
