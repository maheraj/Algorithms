package com.fosociety.algorithm;

import java.util.*;

/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands
 * Time Complexity O(n)
 * Worst case complexity O(n*n)
 * */
public class SortingInsertionSort {

    public static void main(String[] args) {
        int[] array = {22, 11, 99, 88, 9, 7, 42};
        doSorting(array);
        System.out.println(Arrays.toString(array));
    }

    public static void doSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            insert(array, i - 1, array[i]);
        }
    }

    public static void insert(int[] array, int rightIndex, int value) {
        int index;
        for (index = rightIndex; index > -1 && value < array[index]; index--) {
            array[index + 1] = array[index];
        }
        array[index + 1] = value;
    }

}
