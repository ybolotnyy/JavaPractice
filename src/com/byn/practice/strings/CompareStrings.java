package com.byn.practice.strings;

/**
 * Created by ybolotnyy on 1/29/16.
 */
public class CompareStrings {
    public static void main(String args[]) {
        String str = "Hello world";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString));
        System.out.println( str.compareToIgnoreCase(anotherString));
        System.out.println( str.compareTo(objStr.toString()));
    }
}
