package ca.jrvs.challenge;

public class LargestAndSmallestInteger {
  public static int[] LargeAndSmall(int[] nums){
    int max = nums[0];
    int min = nums[0];
    for (int num : nums){
      if (num > max) {
        max = num;
      }
      if (num < min){
        min = num;
      }
    }
    int[] minMax = {min, max};
    return minMax;
  }

}
