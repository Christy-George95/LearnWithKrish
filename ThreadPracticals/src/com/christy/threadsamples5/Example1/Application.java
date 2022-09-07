package com.christy.threadsamples5.Example1;

/*

 */
public class Application {

    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();
        Thread printThread = new Thread(printer);
        printThread.start();
        printThread.interrupt();


        for (int h=0; h<=50;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
        System.out.println("==============================================");//To indicate main thread finished
        //printThread.interrupt();
    }
}
