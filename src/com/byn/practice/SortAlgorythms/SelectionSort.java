package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/13/16.
 */
public class SelectionSort {
  public static void main(String[] args){
    int[] arr = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(selectionSort(arr)));


  }

  public static int[] selectionSort(int[] arr){
    for (int outer = 0; outer < arr.length - 1; outer++){
      int smallestSelected = outer;

      for (int inner = outer + 1; inner < arr.length; inner++){
        if (arr[inner] < arr[smallestSelected]){ smallestSelected = inner; }
      }

      if (outer != smallestSelected){ swap(arr, outer, smallestSelected); }
    }
    return arr;
  }

  public static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
