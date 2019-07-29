package ca.jrvs.challenge;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency4.ValidParentheses;
import org.junit.Test;

public class validParenthesisTest {

  @Test
  public void validParenthesis() {
    assertTrue(ValidParentheses.validParenthesis("([{}])"));
    assertFalse(ValidParentheses.validParenthesis("[(])"));
  }
}