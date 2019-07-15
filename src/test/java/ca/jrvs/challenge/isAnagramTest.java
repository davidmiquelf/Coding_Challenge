package ca.jrvs.challenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class isAnagramTest {

  @Test
  public void isAnagram() {
    assertTrue(isAnagram.isAnagram("", ""));
    assertTrue(isAnagram.isAnagram("a", "a"));
    assertTrue(isAnagram.isAnagram("asdfg", "dsfga"));
  }
}