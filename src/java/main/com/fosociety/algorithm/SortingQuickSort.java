package com.fosociety.algorithm;

import java.util.*;

public class SortingQuickSort {
  public static void main(String[] args) {
    int array[] = {10, 7, 8, 9, 1, 5};
    doSort(array, 0, array.length- 1);
    System.out.println(Arrays.toString(array));
  }
  
  public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for(int j = low; j < high; j++) {
      if(array[j] <= pivot) {
        i++;
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    
    int temp = array[i + 1];
    array[i+1] = array[high];
    array[high] = temp;
    
    return i + 1;
  }
  
  public static void doSort(int[] array, int low, int high) {
    if(low < high) {
      int pi = partition(array, low, high);
      doSort(array, low, pi - 1);
      doSort(array, pi + 1, high);
    }
  }
}
