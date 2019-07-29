package ca.jrvs.challenge;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency5.ValidAnagram;
import org.junit.Test;

public class validAnagramTest {

  @Test
  public void isAnagram() {
    assertTrue(ValidAnagram.isAnagram("", ""));
    assertTrue(ValidAnagram.isAnagram("a", "a"));
    assertTrue(ValidAnagram.isAnagram("asdfg", "dsfga"));
  }
}