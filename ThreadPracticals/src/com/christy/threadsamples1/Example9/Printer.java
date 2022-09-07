package com.christy.threadsamples1.Example9;
/*
In this example child thread have more jobs than main thread
even if main thread finished it allows child to execute
most of the people think if main thread ends java program will stop that's wrong but child thread can continue that work
 */
public class Printer extends Thread{
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }

    public void run(int x) {
        for (int i=0; i<=100;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }
}
