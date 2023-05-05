package com.java.lambda;

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("run() method called....");
    }
}
public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        //Runnable runnable = () -> System.out.println("Lambda run() method called.......");
        Thread t = new Thread(() -> System.out.println("Lambda run() method called......."));
        t.start();
    }
}
