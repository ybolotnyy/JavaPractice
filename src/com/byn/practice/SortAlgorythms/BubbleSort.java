package com.byn.practice.SortAlgorythms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by BYN on 2/12/16.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {9, 7, 5, 3, 1, 2, 4, 6, 8, 0};
        //int[] arr = {0,1,2,3,4,5,6,7,8,9};
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
        int step = 0;
        boolean wasSwap = false;

        do{
            for (int i = 0; i < outer; i++){
                step++;
                if (arr[i] > arr[i+1]){
                    System.out.printf("swapping a[%d]:%d<=>%d:a[%d]    ", i, arr[i], arr[i+1], i+1);
                    swap(arr, i, i+1); wasSwap = true;
                    System.out.println(Arrays.toString(arr));
                } else wasSwap = false;
            }
            outer--;
            System.out.printf("outer=%d \n", outer);
        } while (wasSwap && (outer > 0));
        System.out.printf("%d steps were made \n", step);
        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
