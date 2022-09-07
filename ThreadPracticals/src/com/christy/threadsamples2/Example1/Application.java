package com.christy.threadsamples2.Example1;

/*
Implements thread using runnable interface
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        //Ways of creating threads
        Thread t = new Thread();
        Thread thread = new Thread(printer);
        Thread t2 = new Thread("aa");
        Thread t3 = new Thread(printer, "name");
        //Thread t4 = new Thread(new ThreadGroup(),"ddd");
        //Thread t5 = new Thread(new ThreadGroup(),printer);
        //Thread t6 = new Thread(new ThreadGroup(),printer, "ccc");
        //Thread t7 = new Thread(new ThreadGroup(),printer, "ccc", stackSize);
        thread.start();

        for (int h=0; h<=10;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
        System.out.println("==============================================");//To indicate main thread finished
    }
}
