package com.byn.practice.Stack;

import java.util.Arrays;

/**
 * Created by BYN on 2/17/16.
 */
public class StackBasedOnArray {
  int[] StackArray;
  int maxSize;
  int top;

  public static void main(String[] args){
    StackBasedOnArray ms = new StackBasedOnArray(10);

    ms.push(9);
    ms.push(8);
    ms.push(7);
    ms.push(6);
    ms.push(5);
    ms.push(4);
    ms.push(3);
    ms.push(2);
    ms.push(1);

    ms.pop();
  }

  public StackBasedOnArray(int size) {
    StackArray = new int[size];
    maxSize = size;
    top = -1;
  }

  public void push(int element) {
    if (top = )
    this.StackArray[++top] = element;
    System.out.printf("pushed '%d' -> ", element);
    print();
  }

  public int pop() {
    int topElement;

    topElement = this.StackArray[this.top--];
    System.out.printf("popped '%d' <- ", topElement);
    print();

    return topElement;
  }

  public int peek() {
    int topElement = 0;

    return topElement;
  }

  public void print() {
    System.out.printf("%s : %d elements in Stack: \n",  Arrays.toString(this.StackArray), this.top);
  }
}
