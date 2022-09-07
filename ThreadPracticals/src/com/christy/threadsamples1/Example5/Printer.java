package com.christy.threadsamples1.Example5;

public class Printer extends Thread{

    @Override
    public void run() {
        for (int i=0; i<=10;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }
}
