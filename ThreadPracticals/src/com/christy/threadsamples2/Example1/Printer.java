package com.christy.threadsamples2.Example1;
/*

 */
public class Printer implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Child "+" " + i);//Child Thread-0
        }
    }


}
