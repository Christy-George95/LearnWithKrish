package com.christy.threadsamples1.Example7;

/*
If you extend a Thread class there is no need to override run method but
if you not extend a thread class then you have to override the run method
if you are implementing  runnable interface it automatically suggest you to override run method
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.start();

        for (int h=0; h<=100;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
    }
}
