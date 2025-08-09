package org.java8.lambda;

public class ThreadCreation {

    public void createThreads(){

        new Thread(()->{
            System.out.println("Thread Creation Using lambda");
        }).start();

        //if we want to reuse the lambda store it in runnable and then use

        Runnable r = ()->{
            System.out.println("Thread Creation Using lambda");
        };

        new Thread(r).start();
        new Thread(r).start();


    }
}
