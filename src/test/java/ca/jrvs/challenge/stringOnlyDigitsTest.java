package ca.jrvs.challenge;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency5.stringOnlyDigits;
import org.junit.Test;

public class stringOnlyDigitsTest {

  @Test
  public void onlyDigits() {
    assertTrue(stringOnlyDigits.onlyDigits("12345"));
    assertFalse(stringOnlyDigits.onlyDigits("1 2345"));
    assertTrue(stringOnlyDigits.onlyDigits(""));
  }
}