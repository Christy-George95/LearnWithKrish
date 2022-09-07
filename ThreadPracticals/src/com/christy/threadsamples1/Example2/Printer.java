package com.christy.threadsamples1.Example2;
/*
In this example we are going to override run method
 */
public class Printer extends Thread{

    @Override
    public void run() {
        System.out.println("This is from Child thread");
    }
}
