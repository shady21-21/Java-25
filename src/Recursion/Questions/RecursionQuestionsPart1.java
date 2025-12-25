package Recursion.Questions;
import java.util.ArrayList;

public class RecursionQuestionsPart1 {
    //Q1:
    public  int nthFibonacci(int n){
       if(n == 0)return 0;
       if(n == 1)return 1;
       return nthFibonacci(n-1) + nthFibonacci(n-2);
    }

    //Q2:
    public int binarySearch(int[]arr, int target, int si, int ei){
        if(si>ei) return -1;
        int mid = si + (ei-si)/2;
        if(arr[mid] == target)return mid;

        if(target > arr[mid]){
            return  binarySearch(arr, target, mid+1, ei);
        }else{
            return  binarySearch(arr, target, si, mid - 1);
        }
    }

    //Q3:
    public boolean isSortedUsingRecursion(int index , int[]arr){
        //give a base case.
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && isSortedUsingRecursion(index+1, arr);
    }

    //Q4:

    public int findIndex(int index, int[]arr, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(index+1, arr, target);
        }
    }

    public int findIndexLast(int index, int[]arr, int target){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndexLast(index-1, arr, target);
        }
    }


    //Q5:
    //Return the target occurring index in a list.
    public ArrayList<Integer> findAllIndex(int index, int[]arr, int target, ArrayList<Integer>list){
        if(index  == arr.length){
            return list;
        }
        if(arr[index] ==target){
            list.add(index);
        }
        return findAllIndex(index+1, arr, target,list);
    }


    //Q6:
    public int roatedSortedArrayRecursion(int si, int ei, int[]arr, int target){
        if(si>ei){return -1;}
        int mid = si + (ei - si)/2;
        if(arr[mid] == target){return mid;}

        if(arr[si] <= arr[mid]){
            if(target >= arr[si] && target <= arr[mid]){
                return roatedSortedArrayRecursion(si,mid-1, arr, target);
            }else{
                return roatedSortedArrayRecursion(mid+1, ei, arr, target);
            }
        }
        if(target >= arr[mid] && target <= arr[ei]){
            return roatedSortedArrayRecursion(mid+1, ei, arr, target);
        }
            return roatedSortedArrayRecursion(si,mid-1, arr, target);
    }




    public static void main(String[] args) {

        //Q1:
        RecursionQuestionsPart1 q = new RecursionQuestionsPart1();
//        System.out.println("Nth Fibonacci is : " + q.nthFibonacci(7));

        //Q2: if someone say print fibonacci series up-to 10.
        int N = 10;
//        System.out.println("Fibonacci Number of " + N + "'th terms are :");
        for(int i = 0;i<=N;i++){
//            System.out.print(q.nthFibonacci(i) + " ");
        }


        //Q3:
        int s = q.binarySearch(new int[]{1, 2, 45, 77, 89,0}, 77, 0, 5);
//        System.out.println(s);

//        String ss = q.isSorter(new int[]{1, 2, 3, 25, 8, 19,100});
//        System.out.println(ss);

//        boolean ans = q.isSortedUsingRecursion(0, new int[]{1, 2, 5, 8, 10, 11});
//        System.out.println(ans);

        int fstIndex = q.findIndex(0, new int[]{1,2,3,5,6,6,99},6);
        System.out.println("The target is find at index : " + fstIndex);

        int lastIndex = q.findIndexLast(6,new int[]{1,2,3,5,6,6,99}, 6);
        System.out.println("The last index of target is: " + lastIndex);

        ArrayList<Integer>list = q.findAllIndex(0,new int[]{1,2,6,3,5,6,6,99}, 6, new ArrayList<>());
        System.out.println(list);


        int index = q.roatedSortedArrayRecursion(0, 6,new int[]{5, 6, 7, 8, 9,1,2,3},5);
        System.out.println(index);

    }

}
