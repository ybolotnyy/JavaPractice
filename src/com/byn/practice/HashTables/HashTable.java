package com.byn.practice.HashTables;

/**
 * Created by BYN on 4/2/16.
 */
public class HashTable {
  int hashedArraySize;
  int maxItemsCanBeSaved;
  int totalSavedItemsCount;
  private int[] hashedArray;

  public HashTable(int dataArraySize, int fillRatio) {
    this.hashedArraySize = dataArraySize * 2;
    this.hashedArray = new int[hashedArraySize];

  }

  public void print() {
    if (hashedArray.length == 0) {
      System.out.println("Hash table is empty");
    } else {
      System.out.println("Hash table content: ");
      for (int i = 0; i < hashedArray.length; i++) {
        System.out.printf("%2d - %d %n", i, hashedArray[i]);
      }
    }
  }

  public int hashFunction(int valueToHash) {
    int index = valueToHash % hashedArraySize;
    return index;
  }

  public void put(int value) {
    System.out.printf("\nTrying to insert %d %n", value);
    int index = hashFunction(value);
    if (hashedArray[index] == 0) {
      hashedArray[index] = value;
    } else {
      System.out.printf("Collision at index %d, ", index);
      while (hashedArray[index] != 0 && index < hashedArraySize) {
        index++;
      }
      System.out.printf("next available index is %d %n", index);
      hashedArray[index] = value;
    }
  }
}
