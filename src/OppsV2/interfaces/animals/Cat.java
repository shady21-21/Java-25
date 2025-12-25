package OppsV2.interfaces.animals;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat are eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Cat are sleeping..");
    }
}
