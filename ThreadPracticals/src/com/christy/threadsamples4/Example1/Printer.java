package com.christy.threadsamples4.Example1;
/*
Thread Priority it is starting from 1-10 not 0
Thread Priority the highest priority is 10 and least priority is 1
There is nothing called default priority but most og the people say 5 is a default priority
 */
public class Printer implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=50;i++){
            System.out.println("Child "+" " + i);//Child Thread-0
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
