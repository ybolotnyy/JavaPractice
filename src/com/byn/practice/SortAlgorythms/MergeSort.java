package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/2/16.
 */
public class MergeSort {

  public static void main(String[] args){
    int[] arr = {38,27,43,3,9,82,10};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
  }

  public static int[] mergeSort(int[] arr, int left, int right){
    if (left < right){
      int mid = left + (right - left) / 2; System.out.printf("left:%d, mid:%d, right:%d \n", left, mid, right);
      mergeSort(arr, left, mid); System.out.printf("mergesort[%d-%d] \n", left, mid);
      mergeSort(arr, mid + 1, right); System.out.printf("mergesort[%d-%d] \n", mid+1, right);
      merge(arr, left, mid, right);System.out.printf("merge[%d,%d,%d] \n", left, mid, right);
      System.out.println(Arrays.toString(arr));
      System.out.println();
    }
    return arr;
  }

  public static int[] merge(int[] arr, int left, int mid, int right){
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

    if (i <= mid) {
      arr[k] = temp[i];
      k++;
      i++;
    }

    if (j <= right){
      arr[k] = temp[i];
      k++;
      i++;
    }

    return arr;
  }
}
