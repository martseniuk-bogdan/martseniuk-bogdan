package com.company.lessons21.cons_prod;

public class Producer implements Runnable{
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            myQueue.put(i++);
        }
    }
}
