package PriorityQueue;
import java.util.PriorityQueue;

public class PriorityQueue_Questions {

    //Q1: Nearby Cars.
    //this helper class is for nearestKCars method.
    class Helper implements Comparable <Helper> {
        int x;
        int y;
        int dist;
        int index;
        Helper(int x, int y, int dist, int index){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.index = index; //this is to check where the car is
        }
        @Override
        public int compareTo(Helper h1){
            return this.dist - h1.dist;
        }
    }
    public  void nearestKCars(int[][]pts, int k){
        // i find out the nearest cars base on their distance.

        PriorityQueue<Helper> pq = new PriorityQueue<>();

        for(int i = 0;i<pts.length;i++){
            int distSqrt = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Helper(pts[i][0], pts[i][1],distSqrt, i));
        }

        //print the nearest cars.
        for(int i = 0;i<k;i++){
            System.out.println("C->" + pq.remove().index);
        }
    }


    //Q2: Minimum cost of Ropes.
    public void minimumCostOfRopes(int[]arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        int minCost = 0;
        while(pq.size()>1){ // however, there is 1 ele in PQ
            int min1 = pq.remove();
            int min2 = pq.remove();
            minCost+= min1+min2;
            pq.add(min1+min2);
        }
        System.out.println("Minimum Cost of ropes =  "+ minCost);
    }


    //Q3: Weakest Solider.
    class Row implements Comparable<Row>{
        int cntSolider;
        int index;
        Row(int cntSolider, int index){
            this.cntSolider = cntSolider;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2){
            if(this.cntSolider == r2.cntSolider){
                return this.index - r2.index;
            }else{
                return this.cntSolider - r2.cntSolider;
            }
        }
    }
    public void weakestSolider(int[][]solider, int k){
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i = 0;i< solider.length;i++){
            int cnt = 0;
            for(int j = 0;j<solider[0].length;j++){
               cnt +=  (solider[i][j] == 1) ? 1 : 0;
            }
            pq.add(new Row(cnt, i));
        }
        for(int i = 0;i<k;i++){
            System.out.println("R -> " + pq.remove().index);
        }
    }

    //Q4: Sliding Window maximum. [Time Complexity -> 0(n log k)
    class Pair implements Comparable<Pair>{
        int ele;
        int index;
        Pair(int ele, int index){
            this.ele = ele;
            this.index = index;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.ele - this.ele; // descending order sorted
        }
    }
    public int[]slidingWindowMaximum(int[]arr, int k){
        int n = arr.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int res[]  = new int[n-k+1];

        //iterate thorough 1st kth element.
        for(int i = 0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().ele;
        //now from k to the rest elements.
        for(int i = k;i<n;i++){
            //remove those elements which are not coming my new window.
            //they are exist before my new window.
            while(pq.size()>0 && pq.peek().index <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().ele;
        }
        return res;
    }

}
