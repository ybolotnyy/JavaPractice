package com.byn.practice.strings;

/**
 * Created by ybolotnyy on 1/29/16.
 */
public class SubStringPosition {
    public static void main(String[] args) {
        String strOrig = "Hello world, Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if (lastIndex == -1) {
            System.out.println("an occurrance of \"Hello\" is *not found*");
        }

        System.out.printf("Last occurrence of \"Hello\" is at index %d", lastIndex);
    }
}
