package com.byn.practice.strings;

/**
 * Created by BYN on 1/29/16.
 */
public class ReplaceSubString {
    public static void main(String[] args){
        String str = "Hello world";
        System.out.println(str.replace("wo", "w@"));
        System.out.println(str.replace("world", "Google"));
        System.out.println(str.replace("l", "1"));
    }
}
