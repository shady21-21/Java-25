package OppsV2.accessmodifiers.test;
import OppsV2.accessmodifiers.school.Student;
import OppsV2.accessmodifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.name = "Debu";
//        student.age  = 22;
//        student.sayHello();

        /*if i make any method or variable static i don't create object to call
         through class i can call that method.
         */
        Student.sayBye();




        //+++++++ PROTECTED EXAMPLE ++++++++++++++

        Dog dog = new Dog("Bujoo");
        dog.makeSound();
//      dog.changedSound();
        dog.setDogSound("Woff");
        dog.makeSound();


    }
}
