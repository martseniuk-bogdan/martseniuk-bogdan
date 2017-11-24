package com.company.lessons18;

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
        System.out.println("liza");
    }

    public static boolean identifications(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("incorrect login");
        }
        if (password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("incorrect password");
        }
        return true;
    }
}
