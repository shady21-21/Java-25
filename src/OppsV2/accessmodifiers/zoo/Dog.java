package OppsV2.accessmodifiers.zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name, "bark");
    }

    public void wagTail(){
        System.out.println(getName() + "is waging it's tails");
    }
    private String getName(){
        return getClass().getSimpleName(); //It's just take Class name.
    }

    public void setDogSound(String newSound){
        changedSound(newSound);
    }
}
