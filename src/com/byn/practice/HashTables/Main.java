package com.byn.practice.HashTables;

/**
 * Created by BYN on 4/2/16.
 */
public class Main {

  public static void main(String[] args) {
    int[] inputArrStr = {1,2,3,4,5,6,7,8,9,10};
    HashTable ht = new HashTable(5);
    ht.print();
    ht.put(10);
    ht.put(100);
    ht.put(200);
    ht.print();
  }
}
