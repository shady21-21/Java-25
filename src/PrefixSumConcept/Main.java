package PrefixSumConcept;
import java.util.Arrays;

class Questions{

    //print prefix array with an extra array.
    int[] printPrefixSum(int[]arr){
        // formula - > ans[i] = ans[i-1] + ans[i]
        int n = arr.length;

        int[]ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1;i<n;i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    //change the original array.
    void printPrefixWithOutExtraSpace(int[]arr){
        int n = arr.length;

        for(int i = 1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr)); //print the array.
    }

    //given l, r find the sum between that in array and the array is 1 base indexing.
    void suminRange(int[]arr, int l, int r){
        int n = arr.length;
        for(int i = l;i<r;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(arr[r-1]);
    }

    // partition a array into 2 subarray such that both sum are equal.
    int findArraySum(int[]arr){
        int sum = 0;
        for(int ele : arr){
            sum+= ele;
        }
        return sum;
    }
    boolean equalPartitionPossible(int[]arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;

        for(int i  = 0;i<arr.length;i++){
            prefixSum+= arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum){
                return true;
            }
        }
        return false;
    }
}




public class Main {
    public static void main(String[] args) {
        Questions q = new Questions();
        int[] ans  = q.printPrefixSum(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(ans));

        q.printPrefixWithOutExtraSpace(new int[]{1, 2, 3, 4, 5, 6});
        q.suminRange(new int[]{1, 2, 3, 4, 5, 6}, 2, 2);

        boolean x = q.equalPartitionPossible(new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("Equal partition possible : " + x);
    }
}




