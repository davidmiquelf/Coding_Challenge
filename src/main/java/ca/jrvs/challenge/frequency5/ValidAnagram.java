package ca.jrvs.challenge.frequency5;

import java.util.Arrays;

public class ValidAnagram {

  public static boolean isAnagram(String s, String t){
    char[] as = s.toCharArray();

    Arrays.sort(as);

    char[] at = t.toCharArray();

    Arrays.sort(at);

    return Arrays.equals(as, at);
  }

}
