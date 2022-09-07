package com.christy.threadsamples1.Example4;

/*
If you extend a Thread class there is no need to override run method but
if you not extend a thread class then you have to override the run method
if you are implementing  runnable interface it automatically suggest you to override run method
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.start();
        /*
        In this example child thread gets Thread-0 and Main thread main
        now you can see Main thread executed first even before Child thread executed
         */

        for (int h=0; h<=100;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);// Main main 0
        }
    }
}
