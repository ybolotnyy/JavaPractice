package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/2/16.
 */
public class MergeSort {

  public static void main(String[] args){
    int[] arr = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr, int left, int right){
    if (left < right){
      int mid = left + (right - left) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  public static void merge(int[] arr, int left, int mid, int right){
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }

    int i = left;
    int k = left;
    int j = mid + 1;

    while (i <= mid && j <= right) {
      if (temp[i] < temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      arr[k] = temp[i];
      k++;
      i++;
    }
  }
}
