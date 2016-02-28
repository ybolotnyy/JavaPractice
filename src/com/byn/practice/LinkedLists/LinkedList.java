package com.byn.practice.LinkedLists;

/**
 * Created by BYN on 2/25/16.
 */
public class LinkedList {

  private Link first;

  public LinkedList() {
    first = null;
  }

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

    ll.displayList();

    ll.deleteFirst();
    ll.deleteFirst();

    ll.displayList();

    ll.insertFirst(4);
    ll.insertFirst(5);

    ll.displayList();


    ll.deleteById(3);
    ll.displayList();

    ll.findById(2);

    ll.findByNum(4);

    System.out.printf("\n---------------------------\n");
    ll.insertAfterNum(55, 3);
    ll.displayList();
    System.out.printf("\n---------------------------\n");
    ll.insertAfterKey(55, 777);
    ll.displayList();
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

  public void deleteFirst() {
    Link linkToRemove = first;
    first = linkToRemove.next;
    linkToRemove.DisplayLink(); System.out.println(" was deleted");
  }

  public void deleteById(int id) {
    if (first.iData == id) {
      first.DisplayLink(); System.out.println(" was deleted");
      first = first.next;
      return;
    }

    Link current = first;
    while (current.next != null) {
      if (current.next.iData == id) {
        //delete Link
        System.out.printf("%d was deleted \n", current.next.iData);
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public Link findById(int id) {
    int count = 0;
    Link current = first;
    while (current != null) {
      count++;
      if (current.iData == id) {
        System.out.printf("'%d' was found in link #%d \n", id, count);
        return current;
      }
      current = current.next;
    }
    return current;
  }

  public Link findByNum(int count) {
    Link current = first;
    int i = 1;
    while (current != null && i < count) {
      current = current.next;
      i++;
    }
    System.out.printf("Link in position #%d is '%d'", count, current.iData);
    return current;
  }

  public void displayList() {
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

  public void insertAfterNum(int value, int positionToInsertAfter) {
    Link current = first;
    int i = 1;
    while (i < positionToInsertAfter && current != null) {
      current = current.next;
      i++;
    }

    if (i != positionToInsertAfter) {
      System.out.printf("Insert to position #%d rejected - only %d links in the list \n", positionToInsertAfter, i);
      return;
    }

    System.out.printf("Trying to insert '%d' after position %d \n ", value, i);
    Link newLinkToInsert = new Link(value);
    if (current.next == null) {
      current.next = newLinkToInsert;
    } else {
      Link previos = current;
      Link next = current.next;
      previos.next = newLinkToInsert;
      newLinkToInsert.next = next;
    }

    findById(value);
  }

  public void insertAfterKey(int iKey, int iData) {
    Link current = first;
    int i = 1;
    while (current != null) {
      if (current.iData == iKey) {
        // found position to insert after
        break;
      }
      current = current.next;
      i++;
    }

    insertAfterNum(iData, i);
  }
}
