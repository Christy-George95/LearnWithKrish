package com.christy.threadsamples1.Example6;
/*
In this example we override start() method
Question - Can we override start() method and still we can create thread?
Yes.
 */
public class Printer extends Thread{

    @Override
    public void start() {
        super.start();
        System.out.println("This is start");
    }

    @Override
    public void run() {
        for (int i=0; i<=10;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }
}
