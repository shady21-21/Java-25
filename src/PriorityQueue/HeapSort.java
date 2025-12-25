package PriorityQueue;
import java.util.Arrays;

//Heap sort isn't more efficient than "MERGE AND QUICK" Sort.
public class HeapSort {
    //write down the code of heapify according to max heap.
    public static void heapify(int[]arr, int index, int n){
        int leftChild = 2*index+1;
        int rightChild = 2*index+2;
        int maxIndex = index;

        if(leftChild < n && arr[leftChild] > arr[maxIndex]){
            maxIndex = leftChild;
        }
        if(rightChild < n && arr[rightChild] > arr[maxIndex]){
            maxIndex = rightChild;
        }

        if(maxIndex!= index){
            //swap.
            int tem = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = tem;

            heapify(arr, maxIndex, n);// call heapify
        }
    }
    static void heapSort(int[]arr){
        //step1: Build max Heap.
        int n = arr.length;
        for(int i = n/2;i>= 0;i--){
            heapify(arr,i, n);
        }

        //step2: push largest at end.
        for(int i = n-1;i>= 0;i--){
            //swap.[fist with Last index]
             int tem = arr[0];
             arr[0] = arr[i];
             arr[i] = tem;

             heapify(arr,0,i);
        }
    }


    public static void main(String[] args) {
        //Max Heap provide us -> "Ascending Order"
        //Min Heap provide us -> "Descending Order"

        int[]arr = {1, 2, 4, 5, 3};
        heapSort(arr); // time complexity -> 0(n log n)
        System.out.println(Arrays.toString(arr));
    }
}
