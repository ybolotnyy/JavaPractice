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
    tr.insert(6);
    tr.insert(9);

    tr.insert(1);
    tr.insert(10);

    tr.find(9);

    tr.minValue();
    tr.maxValue();

    tr.displayTreeHorizontally();

    tr. deleteNode(11);
    tr. deleteNode(10);
    tr.displayTreeHorizontally();
    tr. deleteNode(1);
    tr.displayTreeHorizontally();

    tr.insert(1);
    tr.insert(10);
    tr.displayTreeHorizontally();

    tr. deleteNode(2);
    tr. deleteNode(9);
    tr.displayTreeHorizontally();

    tr. deleteNode(10);
    tr. deleteNode(1);
    tr.insert(2);
    tr.insert(15);
    tr.insert(1);
    tr.insert(20);

    tr.insert(13);
    tr.insert(11);
    tr.displayTreeHorizontally();

    tr.deleteNode(7);
    tr.displayTreeHorizontally();

    tr.insert(14);
    tr.displayTreeHorizontally();

    tr.deleteNode(11);
    tr.displayTreeHorizontally();
  }
}
