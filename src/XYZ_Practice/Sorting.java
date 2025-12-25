package XYZ_Practice;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[]arr = {
                3, 1, 44, 2, 9, 100
        };

        System.out.println("After the sort the array: - > " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Before the sort the array: -> " + Arrays.toString(arr));
    }

    static void mergeSort(int[]arr, int si, int ei){

        if(si >= ei){return;}


        int mid = (si+ei)/2;

        mergeSort(arr, si, mid);//divide the left half ..
        mergeSort(arr, mid + 1, ei);//divide the right ..

        merge(arr, si, mid, ei); // now merge the left and right half.
    }

    static void merge(int[]arr, int si, int mid, int ei){

        //this going to implement by two pointer approach.
        int index1 = si;
        int index2 = mid+1;
        ArrayList<Integer> list = new ArrayList<>();

        while(index1 <= mid && index2 <= ei){
            if(arr[index1] < arr[index2]){
                list.add(arr[index1]);
                index1++;
            }else{
                list.add(arr[index2]);
                index2++;
            }
        }

        while(index1 <= mid){
            list.add(arr[index1]);
            index1++;
        }

        while(index2 <= ei){
            list.add(arr[index2]);
            index2++;
        }

        int k = si;
        for(int i = 0;i<list.size();i++){
            arr[k++] = list.get(i);
        }
    }

}
