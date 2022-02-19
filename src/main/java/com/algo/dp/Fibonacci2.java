package com.algo.dp;

public class Fibonacci2 {
    //Top-Down Memoization
    static Integer[] mem;

    public static void main(String args[]) {
        int n = 10;
        mem = new Integer[n];
        mem[0] = 0;
        mem[1] = 1;
        System.out.println(fib(n - 1));
    }

    public static int fib(int n) {
        if (mem[n] != null) {
            return mem[n];
        }
        mem[n] = fib(n - 1) + fib(n - 2);
        return mem[n];
    }
}
