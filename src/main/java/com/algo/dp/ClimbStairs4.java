package com.algo.dp;

public class ClimbStairs4 {
    public static void main(String[] args) {
        ClimbStairs4 obj = new ClimbStairs4();
        int[] cost = {10, 15, 20};
        obj.minCostClimbingStairs1(cost);
    }

    public int minCostClimbingStairs1(int[] cost) {
        int p1 = 0;
        int p = 0;

        for (int i = 0; i < cost.length; i++) {
            int result = Math.min(p1, p) + cost[i];
            p1 = p;
            p = result;
        }
        return Math.min(p1, p);
    }

}