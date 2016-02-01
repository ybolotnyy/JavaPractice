package com.byn.practice.Arrays;

import java.util.Scanner;

/**
 * Created by BYN on 1/31/16.
 */
public class reverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArr(arr);

        reverseArr(arr);
        printArr(arr);
    }

    public static int[] reverseArr(int[] arr){
        int length = arr.length;
        int left, right;

        left = 0; right = length - 1;
        while (left < right) {
            swap(arr, left++, right--);
        }

        return arr;
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = right;
        arr[right] = temp;
    }

    public static void printArr(int[] arr){
        for (int a : arr ) System.out.print(a);
        System.out.println();
    }
}
