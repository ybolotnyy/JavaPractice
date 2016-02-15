package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/14/16.
 */
public class InsertionSort {
  public static void main(String[] args){
    int[] arr = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};
    //int[] arr = {0,1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(insertionSort(arr)));
  }

  public static int[] insertionSort(int[] arr){
    for (int outer = 1; outer < arr.length; outer++){
      for (int inner = 0; inner < outer; inner++){
        if (arr[inner] > arr[outer]){
          // let's insert outer element to left sorted array
          insert(arr, inner, outer);
        }
      }
    }
    return arr;
  }

  public static void insert(int[] arr, int insertTo, int insertFrom){
    int temp = arr[insertFrom];
    for (int i = insertFrom; i > insertTo; i--){
      arr[i] = arr[i-1];
    }
    arr[insertTo] = temp;
  }
}
