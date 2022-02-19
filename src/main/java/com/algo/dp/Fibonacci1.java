package com.algo.dp;

import com.algo.Utils;
import com.sun.org.apache.bcel.internal.classfile.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci1 {
    //Bottom-Up Tabulation
    public static void main(String args []){
        int n = 10;
        fib(n);
    }
    public static void fib(int n){
        Integer [] tab = new Integer [n];
        tab[0]=0;
        tab[1]=1;
        for(int i=2;i<n;i++){
            tab[i]=tab[i-1]+tab[i-2];
        }
        System.out.println(tab[n-1]);
    }
}
