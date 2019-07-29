package ca.jrvs.challenge.frequency4;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the
 * new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int l = nums.length;
    int j = nums.length - 1;
    for (int i = 0 ; i < l ; i++){
      while (nums[i] == val){
        if (j == i){
          nums[i] = 0;
          return l - 1;
        }
        nums[i] = nums[j];
        l--;
        j--;
      }
    }
    return l;
  }
}
