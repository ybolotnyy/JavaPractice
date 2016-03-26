package com.byn.practice.Trees;

import com.byn.practice.Queues.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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

  public void displayTreeHorizontally() {
    if (isEmpty()) {
      return;
    } else {
      System.out.printf("\nPrint the tree horizontally: \n");
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

    System.out.print("\nTraversing BFS - breadth first search:\n");
    breadthFirstSearchBFS(root);
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

  public void breadthFirstSearchBFS(Node root) {
    if (root == null) {
      return;
    }

    java.util.Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      Node c = q.remove();
      System.out.println();
      System.out.printf("%d", c.data);
      if (c.leftChild != null) {
        q.add(c.leftChild);
      }
      if (c.rightChild != null) {
        q.add(c.rightChild);
      }
    }
  }

  public void displayTreeVertically() {
    if (root == null) return;

    java.util.Queue<Node> q = new LinkedList<Node>();
    Map<Node,Integer> l = new HashMap<>();

    int level = 1;
    int oldLevel = 0;
    q.add(root);
    l.put(root,level);

    while (!q.isEmpty()) {
      Node c = q.remove();
      level = l.get(c).intValue();

      String spacer = " ";
      String padding = " ";

      if (level != oldLevel) {
        for (int i = 1; i < (4 - level); i++) {
          padding += " ";
          spacer += "  ";
        }
        if (c == root) {
          padding = "    ";
        }
        System.out.printf("\nlevel %d: %s ", level, padding);
      }

      System.out.printf("%d%s", c.data, spacer);
      oldLevel = level;

      if (c.leftChild != null || c.rightChild != null) {
        level++;
      }

      if (c.leftChild != null) {
        q.add(c.leftChild);
        l.put(c.leftChild, level);
      }
      if (c.rightChild != null) {
        q.add(c.rightChild);
        l.put(c.rightChild, level);
      }
    }
  }

  public Boolean deleteNode(int key) {
    if (isEmpty()) {
      return false;
    }
    System.out.printf("\nTrying to find and delete '%d' : ", key);

    Boolean isLeftChild = false;
    Boolean isRightChild = false;
    Node current = root;
    Node parent = root;
    while (current != null) {
      if (current.data == key) {
        break; // found node
      } else {
        parent = current;
        isLeftChild = false;
        isRightChild = false;

        if (key < current.data) {
          current = current.leftChild;
          isLeftChild = true;
        } else {
          current = current.rightChild;
          isRightChild = true;
        }
      }
    }

    if (current == null) {
      System.out.printf("Node '%d' not found\n", key);
      return false;
    } else {
      System.out.printf("Found node '%d' ", key);

      String child;
      if (isLeftChild) {
        child = "left";
      } else {
        child = "right";
      }

      System.out.printf("at %s child of %d ", child, parent.data);

      // delete the current node
      if (isLeftChild) {
        parent.leftChild = null;
      } else if (isRightChild) {
        parent.rightChild = null;
      } else { // it's the root
        root = null;
        isEmpty();
      }
      System.out.println(" - deleted!");
      return true;
    }
  }
}
