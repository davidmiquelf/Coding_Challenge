package ca.jrvs.challenge.frequency4;

import java.util.Stack;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
 * correct order. Note that an empty string is also considered valid.
 */
public class ValidParentheses {
  public static boolean validParenthesis(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      switch (c) {
        case '(': case '{': case '[':
          stack.push(c);
          break;
        case ')':
          if (stack.empty() || stack.peek() != '(') {
            return false;
          } else {
            stack.pop();
          }
          break;
        case '}':
          if (stack.empty() || stack.peek() != '{') {
            return false;
          } else {
            stack.pop();
          }
          break;
        case ']':
          if (stack.empty() || stack.peek() != '[') {
            return false;
          } else {
            stack.pop();
          }
          break;
      }
    }
    return stack.empty();
  }
}
