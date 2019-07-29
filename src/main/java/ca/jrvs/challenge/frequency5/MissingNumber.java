package ca.jrvs.challenge.frequency5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 */
public class MissingNumber {

  public static int missingNumber(int[] nums){
    if (nums.length == 0){
      return 0;
    }
    int sum = 0;
    for (int i = 1; i <= nums.length ; i++){
      sum += i - nums[i-1];
    }
    return sum;
  }

  public static int missingNumberAlternative(int[] nums){
    Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    for (int i = 0 ; i < nums.length ; i++ ){
      if (!numSet.contains(i)){
        return i;
      }
    }
    return nums.length;
  }

}
