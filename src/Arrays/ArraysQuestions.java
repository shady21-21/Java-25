package Arrays;
import Arrays.Hepler.HelperMethod;


import java.util.*;

public class ArraysQuestions {

    //Q1: Second Largest. | Similar way to find out the Second Min.
    public int secondLargest(int[]arr){
        int max = Integer.MIN_VALUE;
        int sndLargest = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(i, max);
        }
        for(int ele:arr){
            if(ele!= max){
                sndLargest = Math.max(sndLargest, ele);
            }
        }
        return sndLargest;
    }

    //Q2: Rotated array Clock - Wise.
    public void rotatedByK(int[]arr, int k){
        int size = arr.length;
        k = k%size;

        HelperMethod.reverse(arr, 0, size-1);
        HelperMethod.reverse(arr,0 , k-1);
        HelperMethod.reverse(arr,k, size-1);
    }

    //Q3: Move 0's to the end of the array.("Two Pointer Approach")
    public void moveZeroToEnd(int[]arr){
        int i = 0;
        int j = 0;
        while (i<arr.length && j < arr.length){
            if(arr[i] == 0){
                i++;
            }else{
                HelperMethod.swap(arr, j, i);
                i++;
                j++;
            }

        }
    }

    //Q4: Union of two sorted arrays.
    public int[]IntersectionOfSortedArray(int[]nums1, int[]nums2){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> set  = new HashSet<>();
        for(int ele : nums2){
            if(map.containsKey(ele)){
                set.add(ele);
            }
        }
        int index = 0;
        int[]arr = new int[set.size()];
        for(Integer val : set){
            arr[index] = val;
            index++;
        }
        return  arr;
    }

    //Q5: Missing Number in arrays.
    public int missingNumber(int[]arr){
        int n = arr.length;
        // cal the n'th sum of number .
        int nthSum = n*(n+1)/2;
        //cal the actual sum of array.
        int sum = 0;
        for(int ele:arr){
            sum+= ele;
        }
        return nthSum - sum;
    }

    //Q6: Maximum Consecutive 1's.
    public int maximumConsecutiveOnes(int[]arr){
        int cnt = 0;
        int maxOnes = Integer.MIN_VALUE;
        for(int ele :  arr){
            if(ele == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            maxOnes = Math.max(maxOnes, cnt);
        }
        return maxOnes;
    }

    //Q7: Longest subArray sum with K.[HashMap Approach]
    // Same approach with "Longest subArray with sum 0"
    public int subArrayWithSumK(int[]arr, int k){
        //this is brute force approach.
//        int longestSubArrayLen = Integer.MIN_VALUE;
//        int n = arr.length;
//        for(int i = 0;i<n;i++){
//            int sum = 0;
//            for(int j = i;j<n;j++){
//                sum+= arr[j];
//                if(sum == k){
//                    longestSubArrayLen = Math.max(longestSubArrayLen, j-i+1);
//                }
//            }
//        }
//        return longestSubArrayLen;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            sum+= arr[i];

            if(sum == k){
                len = Math.max(len, i+1);
            }
            if(map.containsKey(sum - k)){
                int currLen = i - map.get(sum-k);
                len = Math.max(len, currLen);
            }
            map.put(arr[i], i);
        }
        return len;
    }

    //Q8: Sort 0's 1's 2's | sort colour. [Two Pointer Approach]
    public void sort0s_1s_2s(int[]arr){
        int si = 0;
        int ei = arr.length-1;
        int k = 0;
        while(k<=ei){
            if(arr[k] == 0){
                HelperMethod.swap(arr, si, k);
                si++;
                k++;
            } else if(arr[k] == 1) {
                k++;
            }else{
                HelperMethod.swap(arr,k, ei);
                ei--;
            }
        }
    }

    //Q9: Majority Element
    // [The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.]
    public int majorityElem(int[]arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/2){
                return key;
            }
        }
        return -1;
    }

    // Q10: Intersection of 2 Arrays. [HashMap]
    public int[] unionTwoArray(int[]num1,int[]num2){
        HashSet<Integer> set = new HashSet<>();
        for(int ele1:num1){
            set.add(ele1);
        }
        for(int ele2: num2){
            set.add(ele2);
        }

        int ans[] = new int[set.size()];
        int index = 0;
        for(Integer ele : set){
            ans[index] = ele;
            index++;
        }
        //if you want to print sorted order.
        // Arrays.sort(ans);
        return ans;
    }

    //Q11: Maximum Subarray sum [Kendan's Algo]
    public int maximumSubarraySum(int[]arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i :arr){
            sum+= i;
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

    //Q:12 Stock buy and sell.
    public int stockBuySell(int[]price){
        int maxProfit = 0; // initially I've no profit.
        int buyingPrice = Integer.MAX_VALUE;
        for(int i:price){ // i -> currPrice
            if(i>buyingPrice){
                int profit = i - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyingPrice = i;
            }
        }
        return  maxProfit;
    }

    //Q:13 Rearrange by Sign.
    public int[] rearrangeBySign(int[] arr){
        int n = arr.length;
        // i'll go for the neg ele.
        ArrayList<Integer> negList = new ArrayList<>();
        ArrayList<Integer> posList = new ArrayList<>();
        for(int i:arr){
            if(i<0){
                negList.add(i);
            }else{
                posList.add(i);
            }
        }

        int posIndex = 0;
        int negIndex = 0;
        int index = 0;
        while(posIndex < posList.size() && negIndex < negList.size()){
            arr[index++] = posList.get(posIndex++);
            arr[index++] = negList.get(negIndex++);
        }
        //for the rest elements.
        while(posIndex < posList.size()){
            arr[index++] = posList.get(posIndex++);
        }
        while(negIndex < negList.size()){
            arr[index++] = negList.get(negIndex++);
        }
        return  arr; // see i change in my org array don't take any extra array to store ans and return.
    }

    //Q14: Next Permutation.
    public void nextPermutation(int[]arr){
        int n = arr.length;
        int k = n-2;
        for(int i = n-1;i>0;i--){
            if(arr[i]<= arr[i-1])k--;
            else break;
        }
        if(k == -1){
            HelperMethod.reverse(arr, 0, n-1);
        }

        for(int i = n-1;i>0;i--){
            if(arr[i] > arr[k]){
                HelperMethod.swap(arr, k, i);
                break;
            }
        }
        HelperMethod.reverse(arr, k+1, n-1);
    }

    // Q15: Array Leaders.[In array element called to be Leader if all the element on his right side are smaller]
    public ArrayList<Integer> arrayLeader(int[]arr){
        int maxRight = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = arr.length-1;i>= 0;i--){
            if(arr[i] > maxRight){
                list.add(arr[i]);
                maxRight = arr[i];
            }
        }
        // reverse the array.
        Collections.reverse(list);
        return list;
    }

    // Q16: Count subarray with given sum.
    public int cntSubarraySumWithGivenSum(int[] nums, int k) {

        //TC : -> 0(N) . SC -> 0(N)
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int cnt = 0;
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
            if(map.containsKey(sum-k)){
                cnt+= map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return cnt;

        // brute froce: Tc- > 0(N^2)

         /*
         int len = 0;
         for(int i = 0;i<nums.length;i++){
             int sum = 0;
             for(int j = i;j<nums.length;j++){
                 sum+= nums[j];
                 if(sum == k){
                   len++;
                 }
             }
         }
         return len;*/
    }


    //Q17, 18, 19 : Pascal Triangle all Follow up Questions.a

    // Q15:------- Pascal Triangle ----------------------------------------
    // Here, There are 3 questions,
    //1) Given, the row and col and tell me the element in that place?
    //2) Print the n'th row of pascale triangle?
    //3) print the whole pascale triangle?

    public int[][] generatePascaleTriangle(int numRow){
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[][]ans = new int[numRow][]; //this is my 2D ans array.

        for(int i = 0;i<numRow;i++){
            /*
                0'th row -> 1 col
                1'st row -> 2 col
                2'nd row -> 3 col

                here, we say for - i'th row -> i+1 col.
            */
            ans[i] = new int[i+1];

            //Step2: observed each row 1st and last an element is 1.
            ans[i][0] = ans[i][i] = 1;
            for(int j = 1;j<i;j++){
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return  ans;
            /*
            for(int i = 0;i<numRow;i++){
                ArrayList<Integer> innerList = new ArrayList<>();
                for (int j = 0;j<= i;j++){
                    innerList.add(ans[i][j]);
                }
                list.add(innerList);
            }

            return  list;

             */
    }

    public int getElementInPascaleTriangle(int row, int col){
        //if like in parameter pascale triangle is given as input
        //then it's easy to get that ele using linear search.

        //If, row and col is given then how to find?
        //-> Apply NcR approach.
        int res = 1;
        for(int i = 0;i<col;i++){
            res = res*(row-i);
            res = res/(i+1);

        }
        return res;
    }

    public void printNthRow(int n){
//        for(int i = 0;i<matrix[n].length;i++){
//            System.out.print(matrix[n][i] + " ");
//        }
//        for(int ele : matrix[n]){
//            System.out.print(ele + " ");
//        }

        // what happen if pascale triangle isn't given.

        for(int i = 1;i<=n;i++){
            System.out.print(getElementInPascaleTriangle(n-1, i-1) + " "); // follow 1 base indexing
        }
    }

    // ---------------------------------------------------------------------


    // Q 20: Two Sum
    public int[] twoSum(int[]arr, int target){
        //return the index.
        HashMap<Integer, Integer> map = new HashMap<>();
        int[]ans = new int[2];
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(target - arr[i])){
                ans[0] = map.get(target-arr[i]);
                ans[1] = i;
            }else{
                map.put(arr[i], i);
            }
        }
        return ans;
    }

    //Q 21: Three Sum
    public List<List<Integer>> threeSum (int[]arr){

        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        //here i fixed my first element and look for the other two.
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n-2;i++){
            //take two pointer.
            int left = i+1;
            int right = n-1;

            while(left<right){
                sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    set.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    //Q 22 : 4 Sum.
    public List<List<Integer>> fourSum(int[]arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                int left = j+1;
                int right = n-1;

                while(right>left){
                    sum = arr[i] + arr[j];
                    sum+= arr[left] + arr[right];
                    if(sum == target){
                        set.add(Arrays.asList(arr[i], arr[j], arr[left],arr[right]));
                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return  new ArrayList<>(set);
    }

    //Q 23: Longest subarray sum with 0.
    public int longestSubarraySumWith0(int[]arr){
        int len = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            sum+= arr[i];
            if(sum == 0){
               len = Math.max(len, i+1);
            }
            if(map.containsKey(sum - 0)){
                int currlen = i - map.get(sum-0);
                len = Math.max(len, currlen);
            }else{
                map.put(sum, i);
            }
        }
        return len;
    }

    // Q 24: Maxi Product Subarray..
    public int maxProSubarray(int[]arr){
        int pro = 1;
        int maxPro = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            pro*= arr[i];
            maxPro = Math.max(maxPro, pro);

            if(pro == 0){
                pro = 1;
            }
        }

        pro = 1;
        for(int i =n-1 ;i>= 0;i--){
            pro*= arr[i];
            maxPro = Math.max(maxPro, pro);

            if(pro == 0){
                pro = 1;
            }
        }
        return  maxPro;
    }

    //Q 25: Merge two sorted array with 0(1) space.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int index = m + n - 1;

        while (left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
                nums1[index--] = nums1[left--];
            } else {
                nums1[index--] = nums2[right--];
            }
        }

        // If there are still elements remaining in nums2
        while (right >= 0) {
            nums1[index--] = nums2[right--];
        }
    }

    //Q 26 : Merge Interval (Most Important Question).
    public int[][] mergeInterval(int[][] intervals) {


        //sort the interval array base on 1st index.
        Arrays.sort(intervals, new Comparator<int[]>(){ // instated of this u use Lamda fun.
            @Override
            public int compare(int[]x,int[]y){
                return Integer.compare(x[0], y[0]);
            }
        });

        ArrayList<int[]>list = new ArrayList<>();
        int[]intvalArr = intervals[0];
        list.add(intvalArr);

        for(int[]currInterval : intervals){
            if(currInterval[0] <=  intvalArr[1]){
                intvalArr[1] = Math.max(currInterval[1],intvalArr[1]);
            }else{
                intvalArr = currInterval;
                list.add(intvalArr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
