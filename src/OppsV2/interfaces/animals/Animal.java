package OppsV2.interfaces.animals;

public interface Animal {

    public static final int MAX_AGE = 150; //"public static final " are fadeout coz it's already there if we are not written i will be as it is.
    public abstract void eat();
    void sleep();

    //INTERFACE can also have "static" method..
    public static void info(){
        System.out.println("The this animal Interface!!!!!!");
    }

    //DEFAULT METHOD are also in "INTERFACE"...
    public default void run(){
        this.eat();
        System.out.println("Animal is running....... ");
    }
}
