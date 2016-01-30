package com.byn.practice.strings;

/**
 * Created by ybolotnyy on 1/29/16.
 */
public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(removeCharAt("Hello Google", 1));
        System.out.println(removeCharAt("Hello Google", 6));
        System.out.println(removeCharAt("Hello Google", 8));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0,pos) + s.substring(pos + 1);
    }
}
