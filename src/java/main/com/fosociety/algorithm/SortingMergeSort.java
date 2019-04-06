package com.fosociety.algorithm;


import java.util.*;

public class SortingMergeSort {
  public static void main(String[] args) {
    int array[] = {12, 11, 13, 5, 6, 7};
    doSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }
  
  public static void doSort(int[] array, int left, int right) {
    if(left < right) {
      int mid = (left + right)/2;
      doSort(array, left, mid);
      doSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }
  
  public static void merge(int[] array, int left, int mid, int right) {
    int[] leftHalf = new int[mid - left + 1];
    int[] rightHalf = new int[right - mid];
    
    for(int i = 0; i < leftHalf.length; i++) {
      leftHalf[i] = array[left + i];
    }
    
    for(int i = 0; i < rightHalf.length; i++) {
      rightHalf[i] = array[i + mid + 1];
    }
    
    int i=0, j=0, k=left;
    while(i < leftHalf.length && j < rightHalf.length) {
      if(leftHalf[i] <= rightHalf[j]) {
        array[k] = leftHalf[i];
        i++;
      } else {
        array[k] = rightHalf[j];
        j++;
      }
      k++;
    }
    
    while(i < leftHalf.length) {
      array[k] = leftHalf[i];
      i++;
      k++;
    }
    
    while(j < rightHalf.length) {
      array[k] = rightHalf[j];
      j++;
      k++;
    }
  }
}
