package ca.jrvs.challenge;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency5.FindDuplicateCharacters;
import java.util.Arrays;
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