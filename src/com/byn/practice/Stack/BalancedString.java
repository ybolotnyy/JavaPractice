package com.byn.practice.Stack;

import java.util.Stack;

/**
 * Created by BYN on 2/7/16.
 */
public class BalancedString {
    public static void main(String[] args){
        String balanced = "({[]})";
        String unbalanced = "({[)}]";
        System.out.printf("String \"%s\" is balanced: %b \n", balanced, isStringBalanced(balanced));
        System.out.printf("String \"%s\" is balanced: %b \n", unbalanced, isStringBalanced(unbalanced));
    }

    public static boolean isStringBalanced(String str){
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;

                case ')':
                    if ( st.isEmpty() || st.pop() != '(' )
                        return false;
                    break;
                case '}':
                    if ( st.isEmpty() || st.pop() != '{' )
                        return false;
                    break;
                case ']':
                    if ( st.isEmpty() || st.pop() != '[' )
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}
