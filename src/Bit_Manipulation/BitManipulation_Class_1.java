package Bit_Manipulation;

public class BitManipulation_Class_1 {
    public static void main(String[] args) {
        System.out.print("Print the Original Bit : ");
          printBits(12);
//        System.out.println(isBitSet(36, 5));
//        evenOdd(41);

//        int ans = setIthBit(36, 3);
//        System.out.print("After set the i'th bit : ");
//        printBits(ans);

//        int ans = unsetIthBit(36, 2);
//        System.out.print("After Unset the i'th bit : ");
//        printBits(ans);

//        int ans1 = toggleBit(36, 5);
//        System.out.print("After toggle the i'th bit : ");
//        printBits(ans1);

//        isPowerOf2(32);

          countSetBits(12);

    }

    //print all bits.
    public static  void printBits(int n){
        // i'm printing till 8 bits.
        for(int i = 7;i>= 0;i--){
            //to print all bit i've to (&) all bits one by one with 1
            System.out.print((n>>i) & 1);
        }
        System.out.println();
    }

    //find bit in i'th position.
    public  static boolean isBitSet(int n, int pos){
       int ans =  n & (1<<pos);
       return (ans == 0) ? false : true;
    }

    //Check Even or Odd .
    public static void evenOdd(int n){
        if(isBitSet(n, 0)){
            System.out.println("Odd!");
        }else{
            System.out.println("Even.");
        }
    }

    public  static int setIthBit(int n, int i){
        return  n | (1<<i);
    }

    public static int unsetIthBit(int n, int i){
        return n & ~(1<<i);
    }

    public static  int toggleBit(int n, int i){
        return n ^ (1<<i);
    }

    public static void isPowerOf2(int n){
        if((n & n-1) == 0){
            System.out.println("This is power of 2 ");
        }else{
            System.out.println("Not power of 2!!");
        }
    }

    public  static  int unsetRightMostBit(int n){
        return (n & n - 1);
    }

    //count the number of set bits.
    public static void countSetBits(int n){
        int cnt = 0;
        while(n!= 0){
            cnt++;
            n = unsetRightMostBit(n);
        }
        System.out.print("No of set bits(1) are : " + cnt);
    }
}
