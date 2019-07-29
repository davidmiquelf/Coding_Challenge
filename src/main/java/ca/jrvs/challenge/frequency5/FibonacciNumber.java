package ca.jrvs.challenge.frequency5;


/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 */
public class FibonacciNumber {

  int[] cache = null;

  public int fibRecursive(int n){
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    return fibRecursive(n-1) + fibRecursive(n-2);
  }

  public int fibDP(int n){
    cache = new int[n-2];
    return fibDPHelp(n-1) + fibDPHelp(n-2);
  }

  private int fibDPHelp(int n){
    if (n < 2){
      return n;
    } else if (cache[n-2] != 0){
      return cache[n-2];
    } else {
      return cache[n-2] = fibDPHelp(n-1) + fibDPHelp(n-2);
    }
  }
  public int fibQuick(int n){
    if(n==0){
      return 0;
    }
    int i = 0;
    int j = 1;
    int count = n;
    while (n > 1){
      i = i + j;
      //swap i and j.
      i = i + j;
      j = i - j;
      i = i - j;
      n--;
    }
    return j;
  }
}
