package com.algo.dp;

public class HouseRobber {

    public int rob(int[] nums) {
        int l = nums.length;
        if(l==0){
            return 0;
        }
        if(l==1){
            return nums[0];
        }
        if(l==2){
            return Math.max(nums[0],nums[1]);
        }
        if(l==3){
            return Math.max(nums[0]+nums[2], nums[1]);
        }
        int sums[] = new int[l];
        sums[0] = nums[0];
        sums[1] = nums[1];
        sums[2] = nums[2] + nums[0];
        for (int i = 3; i < nums.length; i++) {
            int p1 = i - 2;
            int p2 = i - 3;
            int s = Math.max(sums[p1], sums[p2]);
            sums[i] = s + nums[i];
        }
        return Math.max(sums[sums.length - 1], sums[sums.length - 2]);
    }
}

