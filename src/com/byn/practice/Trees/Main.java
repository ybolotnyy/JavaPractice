package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Main {
  public static void main(String[] args) {
    Tree tr = new Tree();

    tr.insert(5);
    tr.insert(3);
    tr.insert(7);
    tr.insert(2);
    tr.insert(4);
    tr.insert(9);
    tr.insert(6);
//    tr.insert(10);

    tr.find(9);

    tr.minValue();
    tr.maxValue();

    tr.traverseInOrder();

    tr.displayTree();
  }
}
