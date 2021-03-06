package com.byn.practice.SearchAlgorythms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BYN on 2/9/16.
 */
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] validArr = {11, 33, 55, 59, 77, 99, 111, 333, 555, 777, 999};
        int[] emptyArr = {};
        int[] oneElementArr = {555};

        Map<String, int[]> arrayMap = new HashMap<>();
        arrayMap.put("validArray", validArr);
        arrayMap.put("emptyArray", emptyArr);
        arrayMap.put("oneElementArray", oneElementArr);

        int[] arr = arrayMap.get("validArray");
        System.out.printf("Searching element %d in '%s' \n", 77, "validArray");
        System.out.println("position: " + binarySearchReccur(arr,77, 0, arr.length));
    }

    public static int binarySearchReccur(int[] arr, int key, int leftBound, int rightBound){
        System.out.println(Arrays.toString(arr));
        if (arr.length == 0 || arr == null) {
            return -100; // empty array
        }
        if (arr.length == 1 && arr[0] == key) {
            return 0; // found it from the start ;)
        }
        if (arr.length == 1 && arr[0] != key) {
            return -1;   // key not found
        }

        System.out.printf("Searching for '%d' value \n\n", key);

        while (leftBound <= rightBound){
            int currentPointer = leftBound + (rightBound - leftBound) / 2;
            System.out.printf("leftBound=%d, currentPointer=%d, rightBound=%d   \n\n",
                    leftBound, currentPointer, rightBound);

            if (arr[currentPointer] == key){
                System.out.printf("Found key:%d in arr[%d]! \n", key, currentPointer);
                return currentPointer;
            } else if (key < arr[currentPointer]){
                // go left
                System.out.printf("key:%d < arr[%d]:%d, so going left \n", key, currentPointer, arr[currentPointer]);
                return binarySearchReccur(arr, key, leftBound, currentPointer - 1);
            } else {
                // go right
                System.out.printf("key:%d >= arr[%d]:%d, so going right \n", key, currentPointer, arr[currentPointer]);
                return binarySearchReccur(arr, key, currentPointer + 1, rightBound);
            }
        }
        return -1;
    }
}
