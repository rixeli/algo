package com.algo.ds;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {
  public static void main(String[] args) {
    Duplicate obj = new Duplicate();
    int [] nums = {1,2,3,4};
    System.out.println(obj.containsDuplicate(nums));
  }
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> data = new HashSet<>();
    for (int num : nums) {
      if(!data.add(num)){
        return true;
      }
    }
    return false;
  }

}
