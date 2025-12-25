package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BinarySearchQuestions questions  = new BinarySearchQuestions();

        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]  = sc.nextInt();
        }*/

        int[]arr = {4, 5, 6, 7, 0, 1, 2};
        //call all fun here.
        int index = questions.searchinRoatedSortedArray(arr, 0);
//        System.out.println("Target is on index : " + index );

        int[]arr2 = {2,5,6,0,0,1,2};
        int index2 = questions.searchinRoatedSortedArray_II(arr2, 6);
//        System.out.println("Index on : " + index2);

        int[]arr3 = {3,4,5,1,2};
        int min = questions.findMin(arr3);
//        System.out.print("Minimum element in the array is : " + min);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 7, 1, 2, 3, 4 ,5));
        int rotation  =  questions.findKthRotation(list);
//        System.out.println("The List has been roated : " + rotation);

        int[]arr4  = {1, 1, 2, 2, 5 ,3, 3, 4, 4, 8, 8};
        int singleEle = questions.singleEl(arr4);
//        System.out.println("Single element is : " + singleEle);

        int[]arr5 = {1, 2, 1, 3, 5, 6, 4};
        int peekEl = questions.findPeakElement(arr5);
//        System.out.println("Peek Element is : " + peekEl);

        int n = 25;
        int sqrt = questions.sqrt(n);
//        System.out.println("The Sqrt of n is : " + sqrt);

        int ans = questions.NthRoot(2, 9);
        System.out.println("Nth Root of M is : " + ans);
    }

}
