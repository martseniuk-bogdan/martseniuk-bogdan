package com.company.lessons21;

public class SynchMain extends Thread {
    private StringBuilder str;

    public SynchMain(StringBuilder str) {
        this.str = str;
    }

    @Override
    public void run() {
        synchronized (str) {
            for (int i = 0; i < 100; i++) {
                System.out.print(str + " ");

            }
            System.out.println(" Thread- " + Thread.currentThread().getName());
            char c = str.charAt(0);
            str.setCharAt(0, ++c);
        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder( "A");
        Thread thread1 = new SynchMain(str);
        Thread thread2 = new SynchMain(str);
        Thread thread3 = new SynchMain(str);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
