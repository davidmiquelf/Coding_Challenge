package ca.jrvs.challenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class validParenthesisTest {

  @Test
  public void validParenthesis() {
    assertTrue(validParenthesis.validParenthesis("([{}])"));
    assertFalse(validParenthesis.validParenthesis("[(])"));
  }
}