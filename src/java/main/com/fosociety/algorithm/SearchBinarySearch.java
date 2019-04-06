package com.fosociety.algorithm;

public class SearchBinarySearch {

public static void main(String[] args) {
  int[]array = {1,2,3,4,5,6,7,8,9};
  int targetValue = 8;
  
  System.out.println(doSearch(array, targetValue));
}

  public static int doSearch(int[]array, int targetValue) {
    int min = 0, max = array.length;
    int guess;
    while (min <= max) {
      guess = (min + max) / 2;
      if(array[guess] == targetValue) {
        return guess;
      } else if(array[guess] < targetValue) {
        min = guess + 1;
      } else {
        max = guess - 1;
      }
    }
    return -1;
  }
}
