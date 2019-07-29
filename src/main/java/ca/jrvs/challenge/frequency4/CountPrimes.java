package ca.jrvs.challenge.frequency4;

public class CountPrimes {

  private boolean isPrime(int n) {
    if (n == 2 || n == 3) {
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0 || n == 1) {
      return false;
    }
    int i = 5;
    int j = 2;

    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }
      i += j; // for i > 3, i is prime only if i mod 6 = 1 or 5
      j = 6 - j; // j alternates between 4 and 2.
    }
    return true;
  }

  public int countPrimes(int n) {
    int count = 0;

    if (n > 2) {
      count += 1;
    }
    if (n > 3) {
      count += 1;
    }

    int i = 5;
    int j = 2;
    while (i < n) {
      if (isPrime(i)) {
        count += 1;
      }
      i += j;
      j = 6 - j;
    }
    return count;
  }
}
