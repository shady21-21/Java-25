package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[]arr = {12, 3, 4, 11, 15};
        int[]nums = {1,0,0,1,0,0,1,1};


//        System.out.print("Original Array : ");
//        System.out.println(Arrays.toString(arr));
        ArraysQuestions questions = new ArraysQuestions();

        int x = questions.secondLargest(arr); // --- call methods
//        System.out.println("Second Largest is: " + x);

        questions.rotatedByK(arr, 3); // --- call methods
//        System.out.print("After Rotate the array : ");
//        System.out.println(Arrays.toString(arr));

        questions.moveZeroToEnd(nums); // --- call methods
        System.out.print("After moving zero to end : " + Arrays.toString(nums));


        int[]num1 = {1, 2, 3, 4, 11, 15};
        int[]num2 = {2, 3, 11, 15};
//        System.out.println("Intersection of two Sorted Arrays : ");
        int []ans = questions.IntersectionOfSortedArray(num1, num2); // --- call methods.
//        System.out.print(Arrays.toString(ans));


        int[]num3 = { 0, 1, 2, 4};
        int missingNum = questions.missingNumber(num3); // --- call methods.
//        System.out.println("Missing Number is: " + missingNum);


        int[]num4 = {2, 3, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1};
        int maxOnes = questions.maximumConsecutiveOnes(num4);// --- call methods
//        System.out.println("Max Consecutive Ones : " + maxOnes);

        int[]num5 = {10, 5, 2, 7, 1, 9};
        int len = questions.subArrayWithSumK(num5, 15); // --- call methods
//        System.out.println("Max len with sum k is : " + len);

        int[]num6 = {1, 2, 1, 0, 1, 0, 2};
//        System.out.println("Original Array : " + Arrays.toString(num6));
        questions.sort0s_1s_2s(num6);  // --- call methods
//        System.out.println("Sort 0s-1s-2s : " + Arrays.toString(num6));


        int[]num7 = {2, 2, 3, 3, 3 };
        int majEle =  questions.majorityElem(num7); // --- call methods
//        System.out.println("Majority element is : " + majEle);

        int[] num8 = {1, 2, 3, 4, 5, 20};
        int[] num9 = {3 , 5, 10, 11};
        int[]res = questions.unionTwoArray(num8, num9); // --- call methods
//        System.out.println("Union of 2 arrays is : " + Arrays.toString(res));

        int[] num10 = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = questions.maximumSubarraySum(num10); // --- call methods
//        System.out.println( "Maximum subarray sum : "+ maxSum);

        int[]price = {7,1,5,3,6,4};
        int maxProfit = questions.stockBuySell(price); // --- call methods
//        System.out.println("Maximum profit is : " + maxProfit);

        int[]num11 = {3, 1,-2, -5, 2, -4};
        int[] res2 = questions.rearrangeBySign(num11);// --- call methods
//        System.out.println(Arrays.toString(res2));

        int[]permutationArray = { 2, 3, 1};
//        System.out.println("Original Array : " + Arrays.toString(permutationArray));
        questions.nextPermutation(permutationArray); // --- call methods
//        System.out.print("After permutation : " + Arrays.toString(permutationArray));


        int[]Leader = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ansList = questions.arrayLeader(Leader); // --- call methods
//        System.out.println(ansList);

        int[]num12  = {10 , 2, -2, -20, 10};
        int k = -10;
        int ans5 = questions.cntSubarraySumWithGivenSum(num12, k);
//        System.out.println("Count subarray sum with given sum is : " + ans5);


        int [][] pascalTriangle = questions.generatePascaleTriangle(6);
//        print2dMatrix(pascalTriangle);

        int getEleInTriangle = questions.getElementInPascaleTriangle(5, 3);
//        System.out.println("The element in (row, col) Pascale Triangle is: " + getEleInTriangle);

//        questions.printNthRow(5);

        int[]nums13 = {2, 7, 10, 5, 9, 4};
        int[]twoSum = questions.twoSum(nums13, 13);
//        System.out.print(Arrays.toString(twoSum));

        int[]num14 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> threeAns = questions.threeSum(num14);
//        System.out.println(threeAns);

        int[]num15 = {1,0,-1,0,-2,2};
        List<List<Integer>> FourAns = questions.fourSum(num15, 0);
//        System.out.println(FourAns);


        int[]nums16 = {1, -1, 0, 0, 1};
        int longestLen = questions.longestSubarraySumWith0(nums16);
//        System.out.println("Longest subarray with the len of 0 is : " + longestLen);


        int[]nums17 = {6, -3, -10, 0, 2};
//        System.out.println("Maximum product subarray sum is : " + questions.maxProSubarray(nums17));

        int[][] matrix = {{1,3},{2, 6},{8,10},{15, 18}};
        int[][] intervalAns = questions.mergeInterval(matrix);
//        System.out.println(Arrays.deepToString(intervalAns)); //using that fun print 2d matrix.


    }

}

