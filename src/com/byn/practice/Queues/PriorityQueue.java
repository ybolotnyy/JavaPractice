package com.byn.practice.Queues;

import java.util.Arrays;

/**
 * Created by BYN on 2/22/16.
 */
public class PriorityQueue {
  private int front;  // front < rear e.g. 1..10
  private int rear;
  private int maxSize;
  private int nItems;
  private int[] queValues;

  public static void main(String[] args) {
    PriorityQueue thePQ = new PriorityQueue(10);
    thePQ.print();
    thePQ.insert(9); thePQ.print();
    thePQ.insert(2); thePQ.print();
    thePQ.insert(8); thePQ.print();
    thePQ.insert(4); thePQ.print();
    thePQ.insert(7); thePQ.print();
    thePQ.insert(6); thePQ.print();
    thePQ.insert(5); thePQ.print();
    thePQ.insert(3); thePQ.print();
    thePQ.insert(1); thePQ.print();
    thePQ.insert(10); thePQ.print();

    thePQ.peekFrontMin();

    thePQ.remove(); thePQ.print();
  }

  public PriorityQueue(int s) {
    this.maxSize = s;
    this.nItems = 0;
    this.front = 0;
    this.rear = -1;
    this.queValues = new int[maxSize];
    System.out.println("Initialized queue array length " + queValues.length + ": " + Arrays.toString(queValues));
  }

  public void insert(int intValue) {
    if (isFull()) return;
    if (isEmpty()) {
      queValues[++rear] = intValue;
      nItems++;
      return;
    }

    int i = front;
    while (intValue < queValues[i]) {
      i++;
    }
    System.out.printf("Let's insert '%d' to position: [%d] \n", intValue, i);

    rear++;
    for (int j = rear; j > i; j--) {
      queValues[j] = queValues[j -1];
    }

    queValues[i] = intValue;
    nItems++;
  }

  public int remove() {
    if (! isEmpty()) {
      int value = queValues[front++];
      nItems--;
      System.out.printf("Removed %d. \n ", value);
      return value;
    }
    return -100;
  }

  public boolean isEmpty() {
    return (size() == 0);
  }

  public boolean isFull() {
    return (size() == maxSize);
  }

  public int size() {
    return nItems;
  }

  public int peekFrontMin() {
    if (isEmpty()) {
      System.out.println("Can't peek. Queue is empty");
      return -1000;
    }
    System.out.printf("Peeked from front: %d \n", queValues[front]);
    return queValues[front];
  }

  public void print() {

    System.out.printf("%2d elements in queue: ", nItems);
    System.out.print("[");
    for (int i = 0; i < queValues.length; i++) {
      if (i == front) {
        System.out.print("<");
      }

      System.out.print(queValues[i]);

      if (i == rear) {
        System.out.print("<");
      }

      if (i < queValues.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");

    if (isEmpty()) {
      System.out.printf("  Queue is empty!");
    } else
    if (isFull()) {
      System.out.printf("  Queue is full!");
    }

    System.out.println();
  }
}
