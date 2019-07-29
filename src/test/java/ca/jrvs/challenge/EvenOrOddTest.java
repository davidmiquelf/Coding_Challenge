package ca.jrvs.challenge;

import static ca.jrvs.challenge.frequency5.EvenOrOdd.isEven;
import static ca.jrvs.challenge.frequency5.EvenOrOdd.isOdd;
import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOrOddTest {

  @Test
  public void odd() {
    assertTrue(isOdd(123123123));
    assertTrue(isOdd(1));
    assertTrue(isOdd(-1));
    assertFalse(isOdd(-2147483648));
  }

  @Test
  public void even() {
    assertTrue(isEven(100002));
    assertTrue(isEven(0));
    assertTrue(isEven(-4));
    assertTrue(isEven(-2147483648));
  }
}