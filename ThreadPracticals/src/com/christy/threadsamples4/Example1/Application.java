package com.christy.threadsamples4.Example1;

/*
Implements thread using runnable interface
Main thread default value 5 when you didn't set priority
If you set a thread priority value beyond the limit java throws IllegalArgumentException
Thread are not indexes
1 is the lowest priority
10 is the highest priority
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();

        Thread thread = new Thread(printer);

        thread.start();
        thread.join(5000);

        for (int h=0; h<=50;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
        System.out.println("==============================================");//To indicate main thread finished
    }
}
