package BinarySearch;
import java.util.ArrayList;

public class BinarySearchQuestions {

    //Q1: Search in the Roated sorted array.
    public int searchinRoatedSortedArray(int[] nums, int target) {

        //Initilize two pointer.
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            //best condition if my mid will be my target.
            if(nums[mid] == target)return mid;

            //check which portion is sorted left or right ?
            if(nums[left]<=nums[mid]){ //it's means my left portion is sorted.
                if(nums[left]<=target && target< nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                //Right portion is Sorted
                if(nums[mid]<target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
    //Q2: Search in the Roated sorted array-II.
    public int searchinRoatedSortedArray_II(int[] nums, int target) {

        //Initilize two pointer.
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            //best condition if my mid will be my target.
            if(nums[mid] == target)return mid;

            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }

            //check which portion is sorted left or right ?
            if(nums[left]<=nums[mid]){ //it's means my left portion is sorted.
                if(nums[left]<=target && target< nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                //Right portion is Sorted
                if(nums[mid]<target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    //Q3: Find the minimum in Roated sorted array.
    public  int findMin(int[]arr){
        int n = arr.length;
        int si  = 0;
        int ei = n-1;

        int min = Integer.MAX_VALUE;
        while (si<= ei){
            int mid = (si+ei)/2;

            // what happen if my array is already sorted..
            if(arr[si]<= arr[ei]){
                min  = Math.min(min, arr[si]);
                break;
            }
            //if left portion of array is sorted.
            if(arr[si] <= arr[mid]){
                min = Math.min(min, arr[si]);;
                si = mid+1;
            }else{
                //right portions.
                ei = mid-1;
                min = Math.min(min, arr[mid]);
            }
        }
        return min;
    }

    //Q4: How many times arrays have been roated. [FIND K'TH ROTATION.]
    public int findKthRotation (ArrayList<Integer>arr){
        // exactly do the same code as find min just to track the min index take a variable.

        int n = arr.size();
        int si = 0;
        int ei = n-1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (si<= ei){
            int mid = (si+ei)/2;
            //if the whole arraylist is sorted.
            if(arr.get(si) <= arr.get(ei)){
                min = Math.min(min, arr.get(si));
                index = arr.indexOf(min);
                break;
            }
            if(arr.get(si) <= arr.get(mid)){
                min = Math.min(min, arr.get(si));
                si = mid+1;
            }else{
                ei = mid-1;
                min = Math.min(min, arr.get(mid));
            }
        }
        index = arr.indexOf(min);
        return index;
    }

    //Q5: Find the Single Element in the sorted array.
    public int singleEl(int[]arr){
        //there are some corner case.
        int n = arr.length;
        if(n == 1)return arr[0];

        //now i will be checking for my first 2 index and last 2 index.
        if(arr[0]!= arr[1])return arr[0];
        if(arr[n-1]!= arr[n-2]) return arr[n-1];

        int si = 1;
        int ei = n-2;
        while(si<= ei){
            int mid = (si+ei)/2;
            //now i'm gonna standing at mid and check my left and right if both are not equal to me i will straight return mid as my ans.
            if(arr[mid]!= arr[mid-1] && arr[mid]!= arr[mid+1])return arr[mid];

            //now check mid is even index or odd index.
            if(mid%2 == 1 && arr[mid] == arr[mid-1]
            || mid%2 == 0 && arr[mid] == arr[mid+1]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }

    //Q6: Peek Element in the array.[LeetCode]
    public int findPeakElement(int[] arr) {

        int n = arr.length;
        int si = 0;
        int ei = n-1;

        while(si<ei){
            int mid = (si+ei)/2;
            if(arr[mid] > arr[mid+1]){
                ei = mid;
            }else{
                si = mid+1;
            }
        }
        return si; //return coz of opposite polarity
    }

    //Q7: Sqrt(X)
    public int sqrt(int n){
        int si = 1;
        int ei = n;
        int ans = 0;
        while(si<= ei){
            int mid = (si+ei)/2;
            if(n >= mid*mid){
                ans = mid;
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }

    //Q8: Find Nth Root of Integer M.
    public int NthRoot(int n, int m) {

        int si = 1;
        int ei = m;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) < m) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }


}
