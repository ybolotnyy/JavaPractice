package com.byn.practice.SearchAlgorythms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BYN on 2/9/16.
 */
public class BinarySearch {
    public static void main(String[] args){

        int[] validArr = {11,33,55,77,99,111,333,555,777,999};
        int[] emptyArr = {};
        int[] oneElementArr = {11,33,55,77,99,111,333,555,777,999};

        System.out.println(Arrays.toString(validArr));

        Map <String, int[]> arrayMap = new HashMap<>();
        arrayMap.put("validArray", validArr);
        arrayMap.put("emptyArray", emptyArr);
        arrayMap.put("oneElementArray", oneElementArr);

        System.out.println(Arrays.toString(arrayMap.get(0)));


        ArrayList al = new ArrayList();
        al.add(validArr);
        al.add(emptyArr);
        al.add(oneElementArr);

        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i).toString());
        }

//        System.out.println(Arrays.toString());
    }

    public static int binarySearch(int[] arr, int key){
        if (arr.length == 0 || arr == null) {
            return -1; // empty array
        };
        if (arr.length == 1 || arr[0] == key) {
            return key; // found it from the start ;)
        }
        if (arr.length == 1 || arr[0] != key) {
            return 0;   // key not found
        }


        int lefBound = 0;
        int righBound = (arr.length / 2);

        return 0;
    }
}
