package com.byn.practice.SortAlgorythms;

import java.util.Arrays;

/**
 * Created by BYN on 2/1/16.
 */
public class QuickSort2 {

    public static void main (String[] args){
        int[] arr = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        int lenght = arr.length;

        quickSortRec(arr, 0, lenght - 1);
    }

    public static void quickSortRec(int arr[], int i, int j){
        int pivot = ( i + j ) / 2;
        int left = i;
        int right = j;

        System.out.println("----------------------------------------");
        System.out.printf("* recurrent call *\n");
        System.out.print(Arrays.toString(arr));
        System.out.printf(" pivot: arr[%d]=%d \n", pivot, arr[pivot]);


        while (left < right) {
            while (arr[left] < arr[pivot]) left++;
            while (arr[pivot] < arr[right]) right--;
            swap(arr, left, right);
            left++;
            right--;

            System.out.print(Arrays.toString(arr));
            System.out.printf(" swapped a[%d] and a[%d]\n", left, right);

            if (left < pivot) left++;
            if (pivot < right) right--;
        }

        quickSortRec(arr, i, pivot);
        quickSortRec(arr, pivot, j);

    }

    public static void swap(int[] a, int left, int right){
        a[left] = a[left] + a[right];
        a[right] = a[left] - a[right];
        a[left] = a[left] - a[right];
    }
}
