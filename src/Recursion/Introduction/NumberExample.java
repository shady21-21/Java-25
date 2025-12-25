package Recursion.Introduction;

// Why Recursion?

// * Solved Bigger/ Complex problem in a Easy Way.
// * You can solve Recursion using Iteration and Vice versa.
// *

public class NumberExample {
    public static void main(String[] args) {

        // print a number 1, 2, 3, 4, 5
        // printNumber(5);
        print(1);
    }

    static void printNumber(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }

    static void print(int n){ //
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }


    // Instated of doing all of this do this...
   /* static void printNumber2(int n){
        System.out.println(n);
        printNumber3(3);
    }
    static void printNumber3(int n){
        System.out.println(n);
        printNumber4(4);
    }
    static void printNumber4(int n){
        System.out.println(n);
        printNumber5(5);
    }
    static void printNumber5(int n){
        System.out.println(n);
    }
    */

}
