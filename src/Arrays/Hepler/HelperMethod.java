package Arrays.Hepler;
public class HelperMethod {

    //this is the reverse of an array.
    public static void reverse(int[]arr, int si, int ei){
        while(si<= ei){
            int tem = arr[si];
            arr[si] = arr[ei];
            arr[ei] = tem;
            si++;
            ei--;
        }
    }

    //this is swap method.
    public  static  void swap(int[]arr, int si, int ei){
        int tem = arr[si];
        arr[si] = arr[ei];
        arr[ei] = tem;
    }

    //Print 2d matrix.
    public static  void print2dMatrix(int[][]matrix){
        for(int[] row : matrix){
            for (int ele:row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
