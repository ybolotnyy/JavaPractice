package com.byn.practice.Trees;

/**
 * Created by BYN on 3/23/16.
 */
public class Main {
  public static void main(String[] args) {
    Tree tr = new Tree();

    /*
    tr.insert(5);
    tr.insert(3);
    tr.insert(7);
    tr.insert(4);
    tr.insert(9);
    tr.insert(8);
    tr.insert(6);
    tr.insert(1);
    tr.insert(2);
    tr.insert(0);
    tr.insert(10);
    */

    tr.insert(5);
    tr.insert(3);
    tr.insert(7);
    tr.insert(2);
    tr.insert(4);
    tr.insert(6);
    tr.insert(9);

    tr.insert(1);
    tr.insert(10);

    tr.find(9);

    tr.minValue();
    tr.maxValue();

    //  tr.traverseTree();

    tr.displayTreeHorizontally();
    //  tr.displayTreeVertically();

    tr. deleteNode(11);
    tr. deleteNode(10);
    tr.displayTreeHorizontally();
    tr. deleteNode(1);
    tr.displayTreeHorizontally();

    tr.insert(1);
    tr.insert(10);
    tr.displayTreeHorizontally();

    tr. deleteNode(2);
    tr.displayTreeHorizontally();

  }
}
