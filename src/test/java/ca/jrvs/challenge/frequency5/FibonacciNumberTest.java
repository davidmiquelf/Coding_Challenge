package ca.jrvs.challenge.frequency5;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciNumberTest {

  @Test
  public void fibRecursive() {
    FibonacciNumber f = new FibonacciNumber();
    assertEquals(5, f.fibRecursive(5));
    assertEquals(6765, f.fibRecursive(20));
  }

  @Test
  public void fibDP() {
    FibonacciNumber f = new FibonacciNumber();
    assertEquals(75025, f.fibDP(25));
  }

  @Test
  public void fibQuick() {
    FibonacciNumber f = new FibonacciNumber();
    assertEquals(75025, f.fibQuick(25));
  }
}