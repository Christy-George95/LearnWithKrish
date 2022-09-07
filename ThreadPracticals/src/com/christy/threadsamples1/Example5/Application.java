package com.christy.threadsamples1.Example5;

/*
If you extend a Thread class there is no need to override run method but
if you not extend a thread class then you have to override the run method
if you are implementing  runnable interface it automatically suggest you to override run method
 */
public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        /*
        Why we have to call the start method?
        What happens without calling start method directly call run() method?
        In this example
         */
        printer.run();
        /*
        You can see now thread name is always main
        It always executes Child before execute Main. this means we have only one thread
        When you are invoking run method you're not giving opportunity to create new thread.
        As a result it just executes a normal method call
         */

        for (int h=0; h<=100;h++){
            System.out.println("Main "+ Thread.currentThread().getName()+ " "+ h);
        }
    }
}
