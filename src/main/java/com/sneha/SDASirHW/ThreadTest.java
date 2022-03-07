package com.sneha.SDASirHW;


class CountingThread extends Thread {
    CountingThread() {
        super();
        this.setName("Default Counting Thread");
        System.out.println("Creating Counting Thread by default Constructor");
    }

    CountingThread(String name) {
        super(name);
        System.out.println("Another Constructor to Creating Counting Thread");
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Result is: " + this.getName() + "-->" + i);
            try {
                sleep(500);
            } catch (Exception e) {
            }

        }
    }
}

public class ThreadTest {
    public static void main(String args[])
    {
        CountingThread t = new CountingThread("Counting Thread 1");
        CountingThread t1 = new CountingThread("Counting Thread 2");
        CountingThread t2 = new CountingThread();
        t.start();
        t1.start();
        t2.start();
    }

}
