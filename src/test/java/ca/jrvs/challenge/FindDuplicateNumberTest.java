package ca.jrvs.challenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindDuplicateNumberTest {

  @Test
  public void findDuplicate() {
    int[] t = {1,3,2,4,1};
    int[] t2 = {3,5,7,2,4,5,5,1};
    assertEquals(FindDuplicateNumber.findDuplicate(t), 1);
    assertEquals(FindDuplicateNumber.findDuplicate(t2), 5);
  }
}