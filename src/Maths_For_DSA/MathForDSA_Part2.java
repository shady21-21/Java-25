package Maths_For_DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathForDSA_Part2 {
    public static void main(String[] args) {
        //countDigit(321);
        //cntDigViaLog(0);
        // checkArmstrong(1532);
        //checkPalindrome(12211);
        printAllDivisor(36);
        //isPrime(13);
        //sieveAlgorithm(40);
        findGCD(24, 36);
        //System.out.println(findGCD_Optimal(24, 36));
        lcm(24, 36);
    }

    static void countDigit(int n){
        if(n == 0){
            System.out.println("Count is : 1");
            return;
        }
        int cnt = 0;
        while(n>0){
            n = n/10;
            cnt++;
        }
        System.out.println("Count is : " +  cnt);
    }

    //count digits using Log.
    static void cntDigViaLog(int n){
        if(n == 0){
            System.out.println("Count is : 1");
            return;
        }
        //int cnt = (int)(Math.log(n) / Math.log(10)) + 1;
        int cnt  = (int)Math.log10(n) + 1; // this is introduced in Java 5
        //in the upper line we are divided to find the log10.This is solved in java 5.
        System.out.println("Count is : " + cnt);
    }


    static  void checkArmstrong(int n){
        int res = 0;
        int orgNum = n;
        while(n>0){
            int lastDigit = n%10;
            res += (int)Math.pow(lastDigit,3);
            n = n/10;
        }
        if(res!=orgNum){
            System.out.println("This " + orgNum + " is not Armstrong Number!");
        }else{
            System.out.println("This " + orgNum + " is Armstrong Number.");
        }
    }

    static void checkPalindrome(int n){
        int ans = 0;
        int org = n;
        while(n>0){
            int lastDigit = n % 10;
            ans += lastDigit * (lastDigit*10);
            n = n/10;
        }
        System.out.println(ans == org);
    }


    static  void printAllDivisor(int n){
        int cnt = 1;
        List<Integer> list = new ArrayList<>();
        while(cnt <= n){
            if(n % cnt  == 0){
                list.add(cnt);
            }
            cnt++;
        }
        System.out.println(list);
    }

    static void isPrime(int n){
        int cnt = 0;
        for(int i = 1;i<= n ;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println("Prime.");
        }else{
            System.out.println("Not Prime!!");
        }
    }

    static  void sieveAlgorithm(int num){
        boolean[]arr = new boolean[num+1];
        Arrays.fill(arr, true);
        int index = 2;
        while(index<= num){
            if(arr[index] == true){
                for(int j = index + index ; j<=num; j+=index){
                    arr[j] = false;
                }
            }
            index++;
        }
        for(int i = 2;i<= num ;i++){
            System.out.println(i + ":" + arr[i]);
        }
    }

    //find the GCD of n1, n2.
    //Brute force approach
    //Time Complexity - O(min(n1, n2))
    static void findGCD(int n1, int n2){
        int gcd = 1;
        for(int i =1;i<=Math.min(n1, n2);i++){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD : " + gcd);
    }

    //Write the Optimal Approach which is "Euclidean Algorithm."
    //Time Complexity - 0(log base phi(min(n1, n2))
    static int findGCD_Optimal(int n1, int n2){
        while (n1>0 && n2>0) {
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }

    static void lcm(int n1, int n2){
        //so lcm(a, b)  = a*b / gcd(a,b) -> this is the formula.

        int ans = n1 * n2 / findGCD_Optimal(n1, n2);
        System.out.println("LCM is :" + ans);
    }

}
