package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/1/16.
 */
public class QuickSort {

    public static void main (String[] args){
        int[] arr = {1, 12, 5, 26, 7, 14, 3, 7, 2};

        quickSortRec(arr, 0, arr.length - 1);

    }

    public static void quickSortRec(int[] arr, int left, int right) {
        System.out.println(Arrays.toString(arr));
        int index = partition(arr, left, right);
        System.out.println(Arrays.toString(arr));

        if (left < (index - 1)) quickSortRec(arr, left, index - 1);
        if (index < right) quickSortRec(arr, index, right);

    }

    public static int partition(int[] arr, int left, int right) {

        System.out.printf("a[%d-%d]: ", left, right);
        printArr(arr, left, right);


        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (pivot < arr[j]) j--;

            //System.out.printf("i=%d, j=%d \n", i, j);

            if (i <= j) {
                System.out.printf("swapping a[%d]:%d and a[%d]:%d \n", i, arr[i], j, arr[j]);
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return i;
    }

    public static void swap(int[] a, int left, int right){
        if (a[left]==a[right]) return;
        a[left] = a[left] + a[right];
        a[right] = a[left] - a[right];
        a[left] = a[left] - a[right];
    }

    public static void printArr(int[] a, int left, int right) {
        System.out.print("[");
        for (int i = left; i <= right; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

}
