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
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.insertFirst(1);
    ll.insertFirst(2);
    ll.insertFirst(3);
    ll.insertFirst(4);
    ll.insertFirst(5);

    ll.print();
  }

  private Link first;

  public LinkedList() {
    first = null;
  }

  public void insertFirst(int iData) {

    if (first == null)
    {
      first = new Link(iData);
      first.next = null;
    }
    else
    {
      Link temp = first;
      first = new Link(iData);
      first.next = temp;
    }
  }

  public void print() {
    System.out.printf("%d > ", first.iData);

    Link pointer = first;
    while (pointer.next != null) {
      pointer = pointer.next;
      System.out.printf("%d > ", pointer.iData);
    }
  }
}
