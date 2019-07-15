package ca.jrvs.challenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class isPalindromeTest {

  @Test
  public void isPalindrome() {
    assertTrue(isPalindrome.isPalindrome(""));
    assertTrue(isPalindrome.isPalindrome("a"));
    assertTrue(isPalindrome.isPalindrome("a: a  ?-a"));
    assertFalse(isPalindrome.isPalindrome("da"));
    assertFalse(isPalindrome.isPalindrome("daed"));
  }
}