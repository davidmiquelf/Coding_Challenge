package ca.jrvs.challenge;

import java.util.Arrays;

public class isAnagram {

  public static boolean isAnagram(String s, String t){
    char[] as = s.toCharArray();

    Arrays.sort(as);

    char[] at = t.toCharArray();

    Arrays.sort(at);

    return Arrays.equals(as, at);
  }

}
