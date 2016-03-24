package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Node {
  public int data;
  Node leftChild;
  Node rightChild;

  public Node(int key) {
    this.data = key;
  }

  public void displayNode() {
    System.out.printf("  %d\n", data);
    System.out.printf(" / \\\n");
    System.out.printf("%d   %d\n", leftChild.data, rightChild.data);
  }

}
