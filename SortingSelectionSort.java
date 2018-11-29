import java.util.*;
public class SortingSelectionSort {

  public static void main(String[] args) {
    int[] array = {22, 11, 99, 88, 9, 7, 42};
    doSorting(array);
    System.out.println(Arrays.toString(array));
  }
  
  public static void doSorting(int[] array) {
    for(int i = 0; i < array.length; i++) {
      int minIndex = indexOfMinimum(array, i);
      swap(array, i, minIndex);
    }
    
    System.out.println(Arrays.toString(array));
  }
  
  public static int indexOfMinimum(int[] array, int startIndex) {
    int minValue = array[startIndex];
    int minIndex = startIndex;
    
    for(int i = startIndex + 1; i < array.length; i++) {
      if(minValue > array[i]) {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }
  
  public static void swap(int[] array, int firstIndex, int secondIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
  }

}
