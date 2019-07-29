package ca.jrvs.challenge;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency5.ValidPalindrome;
import org.junit.Test;

public class validPalindromeTest {

  @Test
  public void isPalindrome() {
    assertTrue(ValidPalindrome.isPalindrome(""));
    assertTrue(ValidPalindrome.isPalindrome("a"));
    assertTrue(ValidPalindrome.isPalindrome("a: a  ?-a"));
    assertFalse(ValidPalindrome.isPalindrome("da"));
    assertFalse(ValidPalindrome.isPalindrome("daed"));
  }
}