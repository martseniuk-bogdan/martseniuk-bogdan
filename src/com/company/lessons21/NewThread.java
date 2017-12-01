package com.company.lessons21;

public class NewThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NewThread thread = new NewThread();
        thread.start();
    }
}
