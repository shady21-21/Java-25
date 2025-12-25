package Maths_For_DSA;

public class MathForDSA {
    public static void main(String[] args) {
        int decimal = 5;
        int base = 2;
        // System.out.println("Decimal Number(" + decimal + ") -> Binary is : " + decimalToBinary(decimal));
        System.out.println("Decimal Number(" + decimal + ") -> to base(" + base+ "): " + decimalToAnyBase(decimal, base));

        //binary to Decimal is.
        //binaryToDecimal(111);  //this converting "Binary" -> "Decimal"
        anyBaseToDecimal(101, 2); //this is convert "AnyBase" -> "Decimal"

        //check Odd Even.
        oddEven(7); //checking for odd | even.
        reverseNumber(6295); // Reverse a number..
        power(2, 4); // cal the 2^4
    }


    //Now i'm convert  Decimal to any base..
    static int  decimalToAnyBase(int decimal,int base){
        // when ever my decimal num is't 0 i'll compute.
        int resNum = 0;
        int power = 0;
        while(decimal>0){
            int rem  = decimal%base;
            decimal /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        return resNum;
    }
    static void anyBaseToDecimal(int binary, int base){
        int res = 0;
        int power = 0;
        while(binary>0){
            int lastDigit = binary%10; // extract the last digit.
            binary/= 10; // reduce the number
            res+= lastDigit * Math.pow(base, power);
            power++;
        }
        System.out.println("Any Base to Decimal : " + res);
    }

    // check for Odd Even number.
    static void oddEven(int num){
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd!");
        }
    }

    //Reverse a Number.
    static  void reverseNumber(int num){
        int res = 0;
        while(num>0){
            int lastDig = num % 10;
            res = res*10 + lastDig;
            num/=10;
        }
        System.out.println("Reverse Number is : " + res);
    }

    //Cal the power.
    static void power(int x, int n){
        double res = 1;
        for(int i = 0;i<n;i++){
            res *= x;
        }
        System.out.println("Power is : " + res);
    }


    /*
    Convert Decimal to Binary.
    static int  decimalToBinary(int decimal){
        // when ever my decimal num is't 0 i'll compute.
        int resNum = 0;
        int power = 0;
        while(decimal>0){
            int rem  = decimal%2;
            decimal /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        return resNum;
    }
    //Convert Binary to Decimal.
    static void binaryToDecimal(int binary){
        int res = 0;
        int power = 0;
        while(binary>0){
            int lastDigit = binary%10; // extract the last digit.
            binary/= 10; // reduce the number
            res+= lastDigit * Math.pow(2, power);
            power++;
        }
        System.out.println("Binary to Decimal : " + res);
    }*/


}
