package Recursion.Questions;
import java.util.Arrays;

public class PatternUsingRecursion {

    public static void main(String[] args) {
//        printTriangle2(5, 0);

         int[]arr = {21, 45,6,2, 1};
//         bubble(arr, arr.length-1, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void printTriangle(int r, int c){
        if(r == 0){return;}
        if(c < r){
            System.out.print("*");
            printTriangle(r, c+1);
        }else{
            System.out.println();
            printTriangle(r-1, 0);
        }
    }
    static void printTriangle2(int r, int c){
        if(r == 0){return;}
        if(c < r){
            printTriangle2(r, c+1);
            System.out.print("*");
        }else{
            printTriangle2(r-1, 0);
            System.out.println();
        }
    }

    static void bubble(int[]arr, int r, int c){
        if(r == 0){return;}
        if(c < r){
            if(arr[c] > arr[c+1]){
                //swap.
                int tem = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = tem;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }

    static void selection(int[]arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c]  > arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r,c+1, max);
            }
        }else{
            int tem = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = tem;
            selection(arr, r-1, 0, 0);
        }
    }
}
