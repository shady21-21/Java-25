package Opps.MultiThreading;

public class Test implements Runnable{ //this is also done extending Thread class
    @Override
    public void run() {
       while(true){
           System.out.println(Thread.currentThread().getName());
       }
    }
}
