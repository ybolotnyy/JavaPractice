package com.byn.practice.LinkedLists;

/**
 * Created by BYN on 2/28/16.
 */
public class DoubleEndedList {
  private class Link {
    int iData;
    Link next;

    Link(int iData) {
      this.iData = iData;
      this.next = null;
    }

    private void displayLink() {
      System.out.print(iData);
    }
  }

  public Link first;
  public Link last;

  DoubleEndedList() {
    this.first = null;
    this.last = null;
  }

  public void insertFisrt(int dataToInsert) {
    Link newLink = new Link(dataToInsert);

    if (first == null) {
      first = newLink;
      last = newLink;
    }
    else {
      Link next = first;
      first = newLink;
      first.next = next;
    }
    System.out.printf("Insert '%d' to 'first'\n", dataToInsert);
    displayList();
  }

  public void insertLast(int dataToInsert) {
    Link newLink = new Link(dataToInsert);
    if (last == null) {
      //empty list
      last = newLink;
      first = newLink;
    }
    else {
      Link previos = last;
      last = newLink;
      previos.next = last;
    }
    System.out.printf("Insert '%d' to 'last'\n", dataToInsert);
    displayList();
  }

  public void removeFirst() {
    System.out.printf("removing 'first': %d \n", first.iData);
    first = first.next;
    displayList();
  }

  public void removeLast() {
    Link current = first;
    Link previos = first;
    while(current != last) {
      previos = current;
      current = current.next;
    }

    System.out.printf("removing 'last': %d \n", current.iData);
    previos.next = null;
    last = previos;

    displayList();
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void displayList() {
    Link currentLink = first;
    int count = 0;
    while (currentLink != null) {
      currentLink.displayLink();
      if (currentLink.next != null) {System.out.printf(" > ");}
      currentLink = currentLink.next;
      count++;
    }
    System.out.printf("    : %d elements in the list [start:%d, end:%d] \n", count, first.iData, last.iData);
  }

  public static void main(String[] args) {
    DoubleEndedList dnl = new DoubleEndedList();

    dnl.insertFisrt(1);
    dnl.insertFisrt(2);
    dnl.insertFisrt(3);
    dnl.insertFisrt(4);

    dnl.insertLast(0);
    dnl.insertFisrt(5);

    dnl.removeFirst();
    dnl.removeLast();
  }
}
