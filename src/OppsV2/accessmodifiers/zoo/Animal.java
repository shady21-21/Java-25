package OppsV2.accessmodifiers.zoo;

public class Animal {
    private String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name + " make sound as : "  + sound);
    }

    protected void changedSound(String newSound){
        this.sound = newSound;
    }
}
