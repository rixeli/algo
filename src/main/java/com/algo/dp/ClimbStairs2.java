package com.algo.dp;

public class ClimbStairs2 {
    public static void main(String[] args) {
        ClimbStairs2 obj = new ClimbStairs2();
        obj.climbStairs(44);
    }

    Integer[] mem;

    public int climbStairs(int n) {
        mem = new Integer[n + 1];
        int result = climbStairs(0, n);
        return result;
    }

    private int climbStairs(int i, int n) {
        if (i > n) return 0;
        if (i == n) return 1;
        int i1 = climbStairs(i + 1, n);
        int i2 = climbStairs(i + 2, n);
        mem[i] = i1 + i2;
        return mem[i];
    }
}
