package com.fosociety.algorithm;

public class RecursivePower {
  public static void main(String[] args) {
    System.out.println(doPower(4, 3));
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static boolean isOdd(int n) {
    return !isEven(n);
  }
  
  public static int doPower(int x, int n) {
    if(n == 0) {
      return 1;
    } else if(n < 0) {
      return 1/doPower(x, -n);
    } else if(isOdd(n)) {
      return x * doPower(x, n - 1);
    } else {//is even
      int val = doPower(x, n/2);
      return val * val;
    }
  }
}
