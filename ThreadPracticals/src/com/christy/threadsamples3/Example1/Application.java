package com.christy.threadsamples3.Example1;

/*
Implements thread using runnable interface
Main thread default value 5 when you didn't set priority
If you set a thread priority value beyond the limit java throws IllegalArgumentException
Thread are not indexes
1 is the lowest priority
10 is the highest priority
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println("Main Before "+Thread.currentThread().getPriority());//Main Before 5
        //Thread.currentThread().setPriority(7);//Main 7
        //Thread.currentThread().setPriority(11);//IllegalArgumentException
        Thread.currentThread().setPriority(1);
        Thread thread = new Thread(printer);
//        thread.setPriority(10);
        //getting main thread priority
        System.out.println("Main "+Thread.currentThread().getPriority());//Main 5
        //Child thread priority
        System.out.println("Child "+ thread.getPriority());//Child 10
        thread.start();

        for (int h=0; h<=50;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
        System.out.println("==============================================");//To indicate main thread finished
    }
}
