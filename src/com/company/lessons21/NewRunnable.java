package com.company.lessons21;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        NewRunnable newRunnable = new NewRunnable();
        Thread thread = new Thread(newRunnable, " -1-");
        Thread thread2 = new Thread(newRunnable);
        Thread thread3 = new Thread(newRunnable, "--3--");

        thread.start();
        thread.setPriority(10);
        thread2.start();
        thread2.setPriority(1);
        thread3.start();
        thread3.setPriority(1);
    }
}
