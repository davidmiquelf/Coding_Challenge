package ca.jrvs.challenge.frequency5;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
  public static int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length ; i++){
      int find = target - nums[i];
      if (map.keySet().contains(find)){
        return new int[]{i, map.get(find)};
      }
      map.put(nums[i], i);
    }
    return null;
  }

}
