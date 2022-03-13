package com.algo.dp;

public class ClimbStairs3 {
    public static void main(String[] args) {
        ClimbStairs3 obj = new ClimbStairs3();
        obj.climbStairs(6);
    }

    public Integer climbStairs(int n) {
        n++;
        double c1 = 0.4472135955;

        //0.4472135955 * (1.61803398875^7- ((-0.61803398875)^7))

        double c2 = Math.pow(1.61803398875,n);
        double c3 = Math.pow(-0.61803398875,n);
        double ret = c1*(c2-c3);
        int ret1= (int) ret;
        return ret1;
    }
}
