package com.company.lessons21.cons_prod;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        MyQueue myQueue = new MyQueue(queue);

        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer1 = new Producer(myQueue);

        Thread t1 = new Thread(consumer1);
        Thread t2 = new Thread(producer1);
        Thread t3 = new Thread(consumer2);

        t1.start();
        t2.start();
        t3.start();

    }

    private Queue<Integer> n = new ArrayDeque<>();

    public MyQueue(Queue<Integer> n) {
        this.n = n;
    }

    public Queue<Integer> getN() {
        return n;
    }

    synchronized Integer get() {
        while (n.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Пoлyчeнo: %s потоком %s%n", n.peek(), Thread.currentThread().getName());
        return n.poll();
    }

    synchronized void put(int n) {
        this.n.add(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}
