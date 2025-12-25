package OppsV2.interfaces;

import OppsV2.interfaces.animals.Animal;
import OppsV2.interfaces.animals.Cat;
import OppsV2.interfaces.animals.Dog;
import OppsV2.interfaces.multipleInheritance.SmartPhone;

public class Test {
    public static void main(String[] args) {
       /*
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info(); //info() is a static method that can access using interface
        //but this static mth is't call using his implemented class.
        // dog.info(); //dog is the impl class of animal interface and info() static met which doest allow to call.

        dog.run(); //here run() is default met call this meth using imp class only not using interface itself.
        //Animal.run() //ERROR!!!
        cat.run();

        */


        SmartPhone pocoX3 = new SmartPhone();

        pocoX3.makeCall("9724956902");
        pocoX3.endCall();

        pocoX3.playMusic();
        pocoX3.stopMusic();

        pocoX3.takePhoto();
        pocoX3.recordVideo();
    }
}
