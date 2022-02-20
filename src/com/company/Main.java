package com.company;

public class Main {

    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener notListener = System.out::println;


        Worker worker = new Worker(listener, notListener);
        worker.start();


    }
}
