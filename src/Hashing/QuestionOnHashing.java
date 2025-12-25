package Hashing;
import java.util.HashMap;

public class QuestionOnHashing {
    //Q1: mostFrqNumber in the array.
    public  int mostFrqNumber(int[]nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int mostFrq = -1;
        int ans = -1;
        for(int i = 0;i<nums.length;i++){
            if(map.get(nums[i]) > mostFrq){
                mostFrq = map.get(nums[i]);
                ans = nums[i];
            }
        }
        return ans;
    }

    //Q2: Count pairs with given sum
    int getPairsCount(int[] arr, int sum) {


        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int ele : arr){
        //     map.put(ele, map.getOrDefault(ele, 0)+1);
        // }
        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(sum-arr[i])){
                cnt+= map.get(sum-arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return cnt;

        //brute froce . TC -> 0(N^2)
        /*int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    cnt++;
                }
            }
        }
        return cnt;*/
    }


}
