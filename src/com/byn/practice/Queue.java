package com.byn.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by BYN on 2/22/16.
 */
public class Queue {
  private int front;
  private int rear;
  private int size;
  private int[] queValues;

  public static void main(String[] args) {
    Queue q = new Queue(10);

  }

  public Queue(int s) {
    this.size = s;
    this.queValues = new int[size];
    System.out.println("Created queue array length " + queValues.length + ": " + Arrays.toString(queValues));
  }

  public void insert() {

  }

  public int remove() {

  }

  public boolean isEmpty() {

  }

  public boolean isFull {

  }
}
