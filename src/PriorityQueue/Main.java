package PriorityQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //obj of PriorityQueue_Questions class
        PriorityQueue_Questions questions = new PriorityQueue_Questions();

        int[][] pts ={
                {3, 3}, {5, -1}, {-2, 4}
        };
        int k = 2;
        questions.nearestKCars(pts, k);

        int[]ropes = {2, 3, 3, 4, 6};
        questions.minimumCostOfRopes(ropes);

        int[][]army = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        questions.weakestSolider(army,k);


        int[]slidingWindow = {1, 3, -1, -3, 5, 3, 6, 7};
        int[]ans = questions.slidingWindowMaximum(slidingWindow, 3);
        System.out.println(Arrays.toString(ans));
    }
}
