package com.algo.dp;

public class Fibonacci2 {
    //Top-Down Memoization
    public static void main(String[] args) {
        Fibonacci2 obj = new Fibonacci2();
        System.out.println(obj.fib(10));
    }

    private int fib(int n) {
        mem = new Integer[n + 1];
        return res(n);
    }

    Integer[] mem;

    private int res(int n) {
        if (n < 2) {
            return n;
        }
        if (mem[n] == null) {
            mem[n] = res(n - 1) + res(n - 2);
        }
        return mem[n];
    }
}
