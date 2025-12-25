package SubarrayQuestions_Pattern;

import java.util.*;

public class Subarray{
    public static void main(String[] args) {

        Question question = new Question();

        int[]arr = {
                2, 3, -8, 7, -1, 2, 3
        };

        ArrayList<ArrayList<Integer>>list = question.generateAllSubarrays(arr);
        // System.out.println(list);

        // question.maximumSubarraySum(arr);
        System.out.println("Maximum Subarray sum : "+question.maxSubarraySum(arr));
        question.printSubArraySumEqualToTarget(arr, 4);
    }
}



class Question{

    ArrayList<ArrayList<Integer>>generateAllSubarrays(int[]arr){

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                ArrayList<Integer> innerList = new ArrayList<>();
                for(int k = i;k<=j ;k++){
                    innerList.add(arr[k]);
                }
                list.add(innerList);
            }

        }
        // System.out.println(list);
        return list;
    }

    void maximumSubarraySum(int[]arr){
        ArrayList<ArrayList<Integer>>list = generateAllSubarrays(arr);
        int maxSum = 0;
        for(ArrayList<Integer> x : list){
            // System.out.println(x);

            int currSum = 0;
            for(Integer xx : x){
                currSum += xx;

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sum is : " + maxSum);
    }

    //this maxSubarray sum is done using Kadane's algo.
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int x : arr){
            currSum+= x;
            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }


    //Find that subarray which sum is equal to target.
    void printSubArraySumEqualToTarget(int[]arr, int target){
        ArrayList<ArrayList<Integer>>list = generateAllSubarrays(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(ArrayList<Integer> xx : list){
            int currSum = 0;
            for(Integer x : xx){
                currSum += x;
                if(currSum == target){
                    ans.add(xx);
                }
            }
        }
        System.out.println("Print the subarray which is equal to Target : ");
        for(ArrayList<Integer> xxx : ans){
            System.out.println(xxx);
        }
    }


    
}