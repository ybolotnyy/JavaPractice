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

    if (isEmpty()) {
      root = insert;
      levels = 1;
      System.out.printf("insert %d to the root\n", key);
      return;
    }

    Node current = root;
    int level = 1;
    String turn = null;
    System.out.printf("insert %d to the ", key);

    Node parent;
    while (true) {
      parent = current;
      if (key < current.data) {
        current = current.leftChild;
        level++;
        if (current == null) {
          parent.leftChild = insert;
          System.out.printf("left of %d at level %d\n", parent.data, level);
          break;
        }
      } else { // key > current.data
        current = current.rightChild;
        level++;
        if (current == null) {
          parent.rightChild = insert;
          System.out.printf("right of %d at level %d\n", parent.data, level);
          break;
        }
      }
    }

    if (level > levels) {
      levels = level;
    }
  }

  public Node delete(int key) {
    return root;
  }

  public boolean isEmpty() {
    if (root == null) {
      System.out.print("The tree is *empty*\n");
      return true;
    }
    return false;
  }

  public void minValue() {
    Node current = root;
    int level = 1;
    while (current.leftChild != null) {
      current = current.leftChild;
      level++;
    }
    System.out.printf("Min tree value is '%d' at level %d\n",current.data, level);
  }

  public void maxValue() {
    Node current = root;
    int level = 1;
    while (current.rightChild != null) {
      current = current.rightChild;
      level++;
    }
    System.out.printf("Max tree value is '%d' at level %d\n",current.data, level);
  }

  public void displayTree() {
    if (isEmpty()) {
      return;
    } else {
      System.out.println("Print the tree horizontally: ");
      inOrderRightToLeft(root, 1);
    }
  }

  public void inOrderRightToLeft(Node localRoot, int level) {
    if (localRoot == null) {
      return;
    } else {
      inOrderRightToLeft(localRoot.rightChild, level+1);
      System.out.printf("level %d", level);
      System.out.printf("%" + level*3 + "s", "");
      localRoot.displayNode();
      inOrderRightToLeft(localRoot.leftChild, level+1);
    }
  }

  public void traverseTree() {
    System.out.print("\nTraversing inOrder:\n");
    inOrder(root);

    System.out.print("\nTraversing preOrder:\n");
    preOrder(root);

    System.out.print("\nTraversing postOrder:\n");
    postOrder(root);
  }

  public void inOrder(Node localRoot) {
    if (localRoot == null) {
      return;
    } else {
      inOrder(localRoot.leftChild);
      localRoot.displayNode();
      inOrder(localRoot.rightChild);
    }
  }

  public void preOrder(Node localRoot) {
    if (localRoot == null) {
      return;
    } else {
      localRoot.displayNode();
      preOrder(localRoot.leftChild);
      preOrder(localRoot.rightChild);
    }
  }

  public void postOrder(Node localRoot) {
    if (localRoot == null) {
      return;
    } else {
      postOrder(localRoot.leftChild);
      postOrder(localRoot.rightChild);
      localRoot.displayNode();
    }
  }
}
