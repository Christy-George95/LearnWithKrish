package com.christy.threadsamples5.Example1;
/*
Sometimes you won't get the exact results because some platform doesn't support primitive scheduling
 */
public class Printer implements Runnable{


    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("I am up ......................");
        }

        for (int i=0; i<=50;i++){
            //Thread.yield();
            System.out.println("Child "+" " + i);//Child Thread-0
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
    }


}
