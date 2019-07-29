package ca.jrvs.challenge.frequency5;

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

  public static boolean isPowerOfTwo(int n){
    return n > 1 & Integer.bitCount(n) == 1;
  }
}
