package com.byn.practice.LinkedLists;

/**
 * Created by BYN on 2/28/16.
 */
public class SortedList {
  private class Link {
    int iData;
    Link next;

    private Link(int iData) {
      this.iData = iData;
      this.next = null;
    }

    private void displayLink() {
      System.out.print(iData);
    }
  }

  Link first;

  SortedList() {
    first = null;
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
    System.out.printf("    : %d elements in the list  \n", count, first.iData);
  }

  public void insert(int iDataToInsert) {
    Link newLink = new Link(iDataToInsert);
    Link current = first;
    int i = 1;

    if (isEmpty()) {
      first = newLink;
    }
    else {
      while (current.next != null) {
        if (current.iData < iDataToInsert && iDataToInsert < current.next.iData) {
          break;
        }
        else {
          current = current.next;
          i++;
        }
        System.out.println("pointer => " + i);
      }

      if (current.next == null) {
        current.next = newLink;
      }
      else {
        Link next = current.next;
        current.next = newLink;
        newLink.next = next;
      }
    }
    System.out.printf("'%d' was inserted to position #%d \n", iDataToInsert, i + 1);
    displayList();
  }

  public Link deleteByKey(int iData) {
    Link current = first;
    Link previos = first;
    int i = 1;

    while (current != null) {
      if (current.iData == iData) {
        System.out.printf("Removing link '%d' in position #%d \n", iData, i);
        break;
      }
      else {
        previos = current;
        current = current.next;
        i++;
      }
    }

    if (current.iData != iData) {
      System.out.printf("'%d' not found. Deletion rejected \n");
      return null;
    }
    else {
      previos.next = current.next;
      displayList();
      return current;
    }
  }

  public static void main(String[] args) {
    SortedList sl = new SortedList();

    sl.insert(1);
    sl.insert(20);
    sl.insert(30);
    sl.insert(40);
    sl.insert(50);
    sl.insert(5);
    sl.insert(45);
    sl.insert(55);

    sl.deleteByKey(5);
    sl.deleteByKey(45);
    sl.deleteByKey(55);
  }
}
