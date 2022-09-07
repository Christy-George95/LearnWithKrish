package com.christy.threadsamples1.Example8;
/*
What happen if we overload the run method?
Nothing different we can overload run method
 */
public class Printer extends Thread{
    public void run() {
        for (int i=0; i<=10;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }

    public void run(int x) {
        for (int i=0; i<=10;i++){
            System.out.println("Child "+ currentThread().getName()+" " + i);//Child Thread-0
        }
    }
}
