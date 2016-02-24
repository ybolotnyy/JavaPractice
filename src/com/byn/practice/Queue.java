package com.byn.practice;

import java.util.Arrays;

/**
 * Created by BYN on 2/22/16.
 */
public class Queue {
  private int front;  // front < rear e.g. 1..10
  private int rear;
  private int maxSize;
  private int nItems;
  private int[] queValues;

  public static void main(String[] args) {
    Queue q = new Queue(10);
    q.print();
    q.insert(1); q.print();
    q.insert(2); q.print();
    q.insert(3); q.print();
    q.insert(4); q.print();
    q.insert(5); q.print();
    q.insert(6); q.print();
    q.insert(7); q.print();
    q.insert(8); q.print();
    q.insert(9); q.print();
    q.insert(10); q.print();

    q.peekFront();

    q.remove(); q.print();
  }

  public Queue(int s) {
    this.maxSize = s;
    this.nItems = 0;
    this.front = 0;
    this.rear = -1;
    this.queValues = new int[maxSize];
    System.out.println("Initialized queue array length " + queValues.length + ": " + Arrays.toString(queValues));
  }

  public void insert(int intValue) {
    if (! isFull()) {
      queValues[++rear] = intValue;
      nItems++;
    }
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
    return (nItems == -1);
  }

  public boolean isFull() {
    return (nItems == maxSize);
  }

  public int size() {
    return nItems;
  }

  public int peekFront() {
    if (isEmpty()) {
      System.out.println("Can't peek. Queue is empty");
      return -1000;
    }
    System.out.printf("Peeked from front: %d \n", queValues[front]);
    return queValues[front];
  }

  public void print() {

    System.out.printf("%d elements in queue: ", nItems);
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

  public void printr() {

    final String COMMA = ", ";
    final String FRONT_MARKER = " >>";
    final String REAR_MARKER = "=> ";

    System.out.printf("%d elements in queue: ", nItems);
    System.out.print("[");
    for (int i = maxSize - 1; i >= 0; i--) {
    //  if (queValues[i] == )
      if (i == 0) {
        System.out.printf("%d", queValues[i]);
      } else if (i == maxSize - 1) {
        System.out.printf("%d%s", queValues[i], COMMA);
      } else if (i == front) {
        System.out.printf("%s%s%d", FRONT_MARKER, queValues[i]);
      } else if (i == rear) {
        System.out.printf("%d%s", queValues[i], REAR_MARKER);
      } else
      System.out.printf("%d%s", queValues[i], COMMA);
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
