package com.christy.threadsamples1.Example2;

/*
1> If you extend a Thread class there is no need to override run method but
if you not extend a thread class then you have to override the run method
if you are implementing  runnable interface it automatically suggest you to override run method

2> In this example printer object calls start() method but start method not in printer class
But it searches start method in it parent class Thread, parent class has the start method.
This is simple inheritance functionality.
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.start();

        System.out.println("This is from Main Thread");
    }
}
