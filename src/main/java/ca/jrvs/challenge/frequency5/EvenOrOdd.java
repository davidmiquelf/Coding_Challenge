package ca.jrvs.challenge.frequency5;

public class EvenOrOdd {

  public static boolean isOdd(int n){
    //return n%2 == 1
    return (n&1) == 1;
  }

  public static boolean isEven(int n){
    //return n%2 == 0
    return (n&1) == 0;
  }


}
