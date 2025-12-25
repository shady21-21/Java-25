package Opps.Generics;

class IntDisplay{
    int ele;
    public void setEle(int ele) {
        this.ele = ele;
    }
    public void getEle() {
        System.out.println("The Element is: " + ele);
    }
}
class FloatDisplay{
    float ele;
    public void setEle(float ele) {
        this.ele = ele;
    }
    public void getEle() {
        System.out.println("The Element is: " + ele);
    }
}

class DoubleDisplay{
    double ele;
    public void setEle(double ele) {
        this.ele = ele;
    }
    public void getEle() {
        System.out.println("The Element is: " + ele);
    }
}


//Create Generics Class to do this same thing without repeating the same thing again and again just to change the data type.
class Display<T extends College>{
    T ele;

    public void setEle(T ele) {
//        this.ele.printClgName(); //this is for just extends
        this.ele = ele;
    }

    public void getEle() {
        System.out.println("The Element is : " + ele );
    }
}
// i have to create this display class as an Object but there is no type safety is there, you can add any data type in it.
//like this -> ["DEBU" , 21, true, 21.111]


//Creating my own custom class.
class College{
    void printClgName(){
        System.out.println("Indian Institute Of Technology–Madras ");
    }
}
class Student extends College{
    void printName(){
        System.out.println("Student Class!");
    }
}
class Teacher extends College{
    void printName(){
        System.out.println("Teacher Class!");
    }
}



public class MyGeneric {

    /*
      T-> type
      E-> element
      V-> value
      K-> key

     */


    //create generic methords.
    public <E> void hey(E ele){
        System.out.println("Hey i'm " + ele);
    }


    public static void main(String[] args) {
       /* IntDisplay Obj = new IntDisplay();
        Obj.setEle(21);
        Obj.getEle();

        FloatDisplay Obj2 = new FloatDisplay();
        Obj2.setEle(3.14f);
        Obj2.getEle();

        DoubleDisplay obj3 = new DoubleDisplay();
        obj3.setEle(1.222222222);
        obj3.getEle();*/

//        Display<String> obj = new Display<>();
//        obj.setEle("West Side!");
//        obj.getEle();

//        Display<College> clg = new Display<>();
//        clg.setEle(new College());

        //Now create a object which only take  only College class if i pass other data given me error
        Display<Student> clg = new Display<>();
        clg.setEle(new Student());

        Display<Teacher> clg1= new Display<>();
        clg1.setEle(new Teacher());


        //Call the generic methord.

        MyGeneric g1 = new MyGeneric();
        g1.hey("Debu");
        g1.hey(21);
        g1.hey(211.1111);

    }
}


