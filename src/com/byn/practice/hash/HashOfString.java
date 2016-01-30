package com.byn.practice.strings;

/**
 * Created by BYN on 1/30/16.
 */
public class HashOfString {
    public static void main(String[] args) {
        String str = "Google";
        System.out.println(str.hashCode());

        System.out.println(hashOfString(str));
    }

    public static long hashOfString(String str){
        long hash = 0;
        int n = str.length();

        for (int i = 0; i < n; i++){
            System.out.printf("s[%d] = %c | hash = %d + ", i, str.charAt(i), hash);
            hash = hash + (long) (str.charAt(i)*Math.pow(31,(n-i)));
            System.out.printf("%s*31^(%d-%d),  \n", str.charAt(i), n, i);
        }

        return hash;
    }
}
