package ca.jrvs.challenge.frequency5;

public class SwapNumsWithoutVar {

  public static void swapNumbers(int i, int j){
    System.out.println("i =" + i);
    System.out.println("j =" + j);
    i = i + j;
    j = i - j; // i + j - j = i
    i = i - j; // i + j - i = j
    System.out.println("i =" + i);
    System.out.println("j =" + j);
  }

}
