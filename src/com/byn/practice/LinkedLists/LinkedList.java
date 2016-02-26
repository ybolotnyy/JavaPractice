package com.byn.practice.LinkedLists;

/**
 * Created by BYN on 2/25/16.
 */
public class LinkedList {

  class Link{
    public int iData;
    public Link next;

    public Link(int iData) {
      this.iData = iData;
      next = null;
    }

    public void DisplayLink() {
      System.out.printf("%d", iData);
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.insertFirst(1);
    ll.insertFirst(2);
    ll.insertFirst(3);
    ll.insertFirst(4);
    ll.insertFirst(5);

    ll.DisplayList();
  }

  private Link first;

  public LinkedList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void insertFirst(int iData) {
    Link newLink = new Link(iData);
    newLink.next = first;
    first = newLink;
    newLink.DisplayLink(); System.out.println(" was inserted");
  }

  public void DisplayList() {
    Link currentLink = first;
    int count = 0;
    while (currentLink != null) {
      currentLink.DisplayLink();
      count++;
      if (currentLink.next != null) {System.out.printf(" > ");}
      currentLink = currentLink.next;
    }
    System.out.printf("  : %d elements in the list \n", count);
  }
}
