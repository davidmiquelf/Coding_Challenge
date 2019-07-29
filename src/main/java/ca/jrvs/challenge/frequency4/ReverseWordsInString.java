package ca.jrvs.challenge.frequency4;

/**
 * Given an input string, reverse the string word by word.
 */
public class ReverseWordsInString {

  public String reverseWords(String s) {
    String[] arr = s.split("\\s+");

    String r = "";
    for (int i = arr.length - 1; i > 0; i--) {
      r += arr[i] + " ";
    }
    if (arr.length > 0) {
      r += arr[0];
    }
    return r.trim();
  }
}
