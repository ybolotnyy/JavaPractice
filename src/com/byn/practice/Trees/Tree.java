package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Tree {
  private Node root;
  private int levels;

  public Tree() {
    this.root = null;
    this.levels = 0;
  }

  public Node find(int key) {
    if (isEmpty()) {
      return null;
    }

    Node current = root;
    int i = 0;
    while (current != null) {
      if (current.data == key) {
        System.out.printf("Found value '%d' at level %d\n", key, ++i);
        return current;
      }
      else {
        if (key < current.data) {
          current = current.leftChild;
          i++;
        }
        else { //key > current.data
          current = current.rightChild;
          i++;
        }
      }
    }
    System.out.printf("Can't find value '%d' across %d levels\n", key, i);
    return null;
  }

  public void insert(int key) {
    Node insert = new Node(key);

    if (root == null) {
      root = insert;
      levels = 1;
      return;
    }

    Node current = root;
    int level = 1;

    if (key < current.data) {
      current.leftChild = insert;
      System.out.printf("insert %d to the left from %d at level %d\n", key, current.data, ++level);
    } else { // key > current.data
      current.rightChild = insert;
      System.out.printf("insert %d to the right from %d at level %d\n", key, current.data, ++level);
    }

    if (level > levels) {
      levels = level;
    }
  }

  public Node delete(int key) {
    return root;
  }

  public void displayTree() {
    if (!isEmpty()) {
      System.out.printf("The tree has %d levels: \n", levels);
      root.displayNode();
      Node current = root;
    }
  }

  public boolean isEmpty() {
    if (root == null) {
      System.out.print("The tree is *empty*\n");
      return true;
    }
    return false;
  }
}
