package Opps.MultiThreading;

public class Hello {
    public static void main(String[] args) {
         // CREATE THREADS.
        //this is another thread, both are running independently.
        //Thread can be implemented using two ways - >
        //1. extends Thread class.
        //2. implements Runnable interface.
        Test test = new Test(); //NEW
        Thread t = new Thread(test);
        t.start(); //RUNNABLE

        //this is the main thread
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
