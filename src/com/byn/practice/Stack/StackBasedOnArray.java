package com.byn.practice.Stack;

/**
 * Created by BYN on 2/17/16.
 */

public class StackBasedOnArray {
  int[] StackArray;
  int maxSize;
  int topIndex;

  public static void main(String[] args){
    StackBasedOnArray ms = new StackBasedOnArray(10);

    try {
      ms.push(9);
      ms.push(8);
      ms.push(7);
      ms.push(6);
      ms.push(5);
      ms.push(4);
      ms.push(3);
      ms.push(2);
      ms.push(1);
      ms.push(0);

      ms.push(11);
      ms.push(22);
      ms.pop();

      ms.push(11);
      ms.pop();
      ms.push(0);

      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();
      ms.pop();

      System.out.printf("\n peek at top - %d \n", ms.peek());
    } catch (StackFullOrEmptyException e) {
      System.out.println("* user exception * : " + e.getReason());
    }

  }

  public StackBasedOnArray(int size) {
    StackArray = new int[size];
    maxSize = size;
    topIndex = -1;
  }

  public void push(int element) throws StackFullOrEmptyException {
    if (topIndex + 1 == maxSize) {
      System.out.printf("\nPush '%d' rejected: the Stack already has %d/%d occupancy \n", element, topIndex + 1, maxSize);
      throw new StackFullOrEmptyException(topIndex, maxSize);
    }
    StackArray[++topIndex] = element;

    System.out.printf("pushed '%d' -> ", element);
    print();
  }

  public int pop() throws StackFullOrEmptyException {
    int topElement = 0;
    if (topIndex == -1) {
  //    System.out.println("Pop rejected: The Stack is empty");
      throw new StackFullOrEmptyException(topIndex, maxSize);
    } else {
      topElement = StackArray[topIndex--];
      System.out.printf("popped '%d' <--- ", topElement);
      print();
    }
    return topElement;
  }

  public int peek() throws StackFullOrEmptyException {
    if (topIndex == -1) {
//      System.err.println("The Stack is empty - throwing exception");
      //return -1000;
      throw new StackFullOrEmptyException(topIndex, maxSize);
    }
    return StackArray[topIndex];
  }

  public void print() {
    if (topIndex == -1) {
      System.out.println("[ ] : The Stack is empty");
      return;
    }

    System.out.print("[");
    for (int i = topIndex; i >= 0; i--) {
      System.out.printf("%d", StackArray[i]);
      if (i > 0) {
        System.out.printf(", ");
      }
    }
    System.out.print("]");

    System.out.printf(" : %d elements in Stack \n", topIndex + 1);
  }
}