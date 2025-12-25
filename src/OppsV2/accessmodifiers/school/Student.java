package OppsV2.accessmodifiers.school;

public class Student {
    public String name;
    public int age;

    //Can I make constructor "PRIVATE"?
    //when we make private cons-> When we want that nobody forcefully doesn't create  constructor

    private Student(){}

    public void sayHello(){
        System.out.println("Hey!Hello..");
    }
    public static void sayBye(){
        System.out.println("BYE!!");
    }
}
