package com.byn.practice.strings;

/**
 * Created by BYN on 1/29/16.
 */
public class ReverseString {
    public static void main(String[] args) {
        String string = "hello Google";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.printf("Initial string: %s \n Reversed string: %s",
                string,
                reverse);
    }
}
