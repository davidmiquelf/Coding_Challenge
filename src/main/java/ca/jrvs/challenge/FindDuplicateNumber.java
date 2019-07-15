package ca.jrvs.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate
 * number, find the duplicate one.
 */
public class FindDuplicateNumber {
  public static int findDuplicate(int[] nums) {
    int fast = nums[nums[0]];
    int slow = nums[0];
    while (slow != fast){
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    fast = 0;
    while (slow != fast){
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }
}
