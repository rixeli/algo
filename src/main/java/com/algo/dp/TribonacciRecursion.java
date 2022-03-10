package com.algo.dp;

import java.util.*;

public class TribonacciRecursion {
    public static void main(String[] args) {
        TribonacciRecursion obj = new TribonacciRecursion();
        System.out.println(obj.tribonacci(25));
    }

    public int tribonacci(int n) {
        mem.add(0);
        mem.add(1);
        mem.add(1);
        if (n < 3) {
            return mem.get(n);
        }
        int result = help(n);
        return result;
    }

    LinkedList<Integer> mem = new LinkedList<>();
    Integer position = 3;


    public int help(int n) {
        if (n < position) {
            return mem.getLast();
        }
        if (n == position) {
            int sum = sumList(mem);
            mem.remove();
            mem.add(sum);
            position++;
        } else {
            help(n - 1);
        }
        return help(n);
    }

    private int sumList(List<Integer> list) {
        Integer sum = 0;
        for (Integer e : list) {
            sum += e;
        }
        return sum;
    }
}
