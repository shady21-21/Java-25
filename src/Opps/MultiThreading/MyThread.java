package Opps.MultiThreading;

public class MyThread extends Thread {
    @Override
    public  void  run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
