package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Main {
  public static void main(String[] args) {
    Tree tr = new Tree();
    tr.displayTree();

    tr.insert(5);
    tr.insert(3);
    tr.insert(7);
    tr.displayTree();

    tr.find(5);
    tr.find(3);
    tr.find(7);
  }
}
