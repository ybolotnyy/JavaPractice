package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Tree {
  private Node root;

  public Tree() {
    this.root = null;
  }

  public Node find(int key) {
    if (isEmpty()) {
      return null;
    }
    else {
      Node current = root;
      if (current.data == key) {
        System.out.printf("Found value '%d'\n", key);
        return current;
      }
      else {
        System.out.printf("Can't find value '%d'\n", key);
        return null;
      }
    }
  }

  public void insert(int key) {
    Node insert = new Node(key);

    if (root == null) {
      root = insert;
    }
    else {
      Node current = root;
      if (key < current.data) {
        current.leftChild = insert;
        System.out.printf("insert %d to left\n", key);
      } else { // key > current.data
        current.rightChild = insert;
        System.out.printf("insert %d to right\n", key);
      }
    }
  }

  public Node delete(int key) {
    return root;
  }

  public void displayTree() {
    if (!isEmpty()) {
      root.displayNode();
      Node current = root;
    }
  }

  public boolean isEmpty() {
    if (root == null) {
      System.out.println("The tree is *empty*\n");
      return true;
    }
    return false;
  }
}
