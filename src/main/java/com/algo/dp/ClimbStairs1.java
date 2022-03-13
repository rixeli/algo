package com.algo.dp;

import com.algo.Utils;

public class ClimbStairs1 {
    public static void main(String[] args) {
        ClimbStairs1 obj = new ClimbStairs1();
        obj.climbStairs(3);
    }

    public int climbStairs(int n) {
        int result = climbStairs(0, n);
        return result;
    }

    private int climbStairs(int i, int n) {
        if (i > n) return 0;
        if (i == n) return 1;
        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }
}
