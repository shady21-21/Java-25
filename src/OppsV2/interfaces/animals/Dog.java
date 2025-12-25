package OppsV2.interfaces.animals;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog are eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Dog are sleeping..");
    }
}
