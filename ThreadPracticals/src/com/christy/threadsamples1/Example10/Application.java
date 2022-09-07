package com.christy.threadsamples1.Example10;

/*
In this example make Child thread as daemon thread
When you are running the program you can see after main thread ended child thread jobs are reducing
java program will terminate when last non-daemon thread ends
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();

        for (int h=0; h<=10;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
        System.out.println("==============================================");//To indicate main thread finished
    }
}
