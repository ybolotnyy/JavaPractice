package com.byn.practice.HashMaps;

import java.util.*;

/**
 * Created by BYN on 2/9/16.
 */
public class ArrayMap {
    public static void main(String[] args) {
        int[] validArr = {11, 33, 55, 77, 99, 111, 333, 555, 777, 999};
        int[] emptyArr = {};
        int[] oneElementArr = {555};

        Map<String, int[]> arrayMap = new HashMap<>();
        arrayMap.put("validArray", validArr);
        arrayMap.put("emptyArray", emptyArr);
        arrayMap.put("oneElementArray", oneElementArr);

        // for-each loop iteration
        for (String aKey : arrayMap.keySet()) {
            String key = aKey;
            int[] value = arrayMap.get(key);
            System.out.printf("%s: %s \n", key, Arrays.toString(value));
        } System.out.println();

        // by key iteration
        Iterator keyIterator = arrayMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = (String) keyIterator.next();
            int[] value = arrayMap.get(key);
            System.out.printf("%s: %s \n", key, Arrays.toString(value));
        } System.out.println();

        // by value iteration
        Iterator valueIterator = arrayMap.values().iterator();
        while (valueIterator.hasNext()) {
            int[] value = (int[]) valueIterator.next();
            System.out.println(Arrays.toString(value));
        } System.out.println();
    }
}
