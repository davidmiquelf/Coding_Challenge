package ca.jrvs.challenge;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class FindDuplicateCharactersTest {

  @Test
  public void findDuplicates() {
    Character[] dups = FindDuplicateCharacters.findDuplicates("just google it");
    Character[] expected = {'t',' ', 'g', 'o'};
    Arrays.sort(dups);
    Arrays.sort(expected);
    assertArrayEquals(dups,expected);
  }
}