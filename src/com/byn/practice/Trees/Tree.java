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
    return root;
  }

  public void insert(int key) {
    Node insert = new Node(key);

    if (root == null) {
      root = insert;
    }
  }

  public Node delete(int key) {
    return root;
  }

  public void displayTree() {
    root.displayNode();
  }
}
