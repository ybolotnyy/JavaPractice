package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/1/16.
 */
public class QuickSort {

    public static void main (String[] args){
        int[] arr = {1, 12, 5, 26, 7, 14, 3, 7, 2};

        System.out.println(Arrays.toString(arr));
        quickSortRec(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSortRec(int[] arr, int left, int right) {
        int index = partition(arr, left, right);

        if (left < (index - 1)) quickSortRec(arr, left, index - 1);
        if (index < right) quickSortRec(arr, index, right);

    }

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (pivot < arr[right]) right--;

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] a, int left, int right){
        if (a[left]==a[right]) return;
        a[left] = a[left] + a[right];
        a[right] = a[left] - a[right];
        a[left] = a[left] - a[right];
    }

}
