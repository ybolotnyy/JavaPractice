package com.byn.practice.SortAlgorythms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by BYN on 2/12/16.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) throws NullPointerException{
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 1){
            return arr;
        }

        int outer = arr.length - 1;

        while (outer > 0){
            for (int i = 0; i < outer; i++){
                if (arr[i] > arr[i+1]){
                    System.out.printf("swapping a[%d]:%d<=>%d:a[%d]    ", i, arr[i], arr[i+1], i+1);
                    swap(arr, i, i+1);
                    System.out.println(Arrays.toString(arr));
                }
            }
            outer--;
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
