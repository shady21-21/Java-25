package Bit_Manipulation;

public class BitManipulation_Class2 {
    public static void main(String[] args) {
//        System.out.print("Original Bit is : ");
//        printBits(53);
//        int res1 = clearLSB(53, 4);
//        System.out.print("Clear LSB : ");
//        printBits(res1);
//        System.out.print("Clear MSB : ");
//        int res2 = clearMSB(53, 4);
//        printBits(res2);
//        int res3 = clearMSBExclusive(53, 4);
//        System.out.print("Clear MSB exclusive i : ");
//        printBits(res3);

//        char ch1 = convertToUpperCase('a');
//        System.out.println("Convert LowerCase to UpperCase : " + ch1);
//        char ch2 = convertToLowerCase('B');
//        System.out.println("Convert UpperCase to LowerCase : " + ch2);
//
//        swap(21,99);

         //find the unique element in the array.("Every ele occ twice except one return that unique elem")
         int[]arr  = {2, 4, 2, 3, 3, 6, 1, 1, 6, 4, 21};
         printUniqueEle(arr);

    }


    public static void printBits(int n){
        for(int i = 7;i>= 0;i--){
            System.out.print((n>>i) & 1);
        }
        System.out.println();
    }

    public static int clearLSB(int n , int i){
        return n & ~((1<<i+1)-1);
    }
    public static int clearMSB(int n , int i){
        return n & ((1<<i)-1);
    }
    public static int clearMSBExclusive(int n , int i){
        return n & ((1<<i+1)-1);
    }

    public static char convertToUpperCase(int n){
        return (char)(n & ~(1<<5));
    }

    public static char convertToLowerCase(int n){
        return (char)(n |(1<<5));
    }

    //Here is the concept of XOR.
    public static  void swap(int x, int y){
        System.out.println("[Number: " + x + "] [Number: " + y + "]");
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap : ");
        System.out.println("[Number: " + x + "] [Number: " + y + "]");
    }

    public static void printUniqueEle(int[]arr){
        int ans = 0;
        for(int ele : arr){
            ans ^= ele;
        }
        System.out.println("The unique element is : " + ans);
    }

}

