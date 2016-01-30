package com.byn.practice.strings;

/**
 * Created by BYN on 1/30/16.
 */
public class SplitString {
    public static void main(String[] args){
        String str = "Hello world hello Google";
        String[] temp;
        String delimiter = " ";
        temp = str.split(delimiter);

        for (String s : temp){
            System.out.println(s + " " + s.hashCode());
        }
    }
}
