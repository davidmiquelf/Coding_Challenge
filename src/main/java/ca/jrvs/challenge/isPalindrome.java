package ca.jrvs.challenge;


/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class isPalindrome {

  public static boolean isPalindrome(String s) {
    String p = s.replaceAll("[^A-Za-z0-9]", "");
    char[] ar = p.toCharArray();

    for (int i=0 ; i < (ar.length)/2 ; i+=1) {
      if (Character.toLowerCase(ar[i]) != Character.toLowerCase(ar[ar.length-1-i])){
        return false;
      }
    }
    return true;
  }
}
