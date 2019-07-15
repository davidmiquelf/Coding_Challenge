package ca.jrvs.challenge;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Return duplicate characters in a string.
 * O(n) assuming Java's hash functions are O(1).
 */
public class FindDuplicateCharacters {

  public static Character[] findDuplicates(String s){
    Set<Character> chars = new HashSet<>();
    return s.chars()
        .mapToObj(c -> (char)c)
        .filter(c -> !chars.add(c))
        .toArray(Character[]::new);
  }

}
