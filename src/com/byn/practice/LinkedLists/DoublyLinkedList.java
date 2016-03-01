package com.byn.practice.LinkedLists;

/**
 * Created by BYN on 2/28/16.
 */
public class DoublyLinkedList {
  private class Link {
    int iData;
    Link next;
    Link previous;

    Link(int iData) {
      this.iData = iData;
    }
  }

  Link first;
  Link last;

  DoublyLinkedList() {
    first = null;
    last = null;
  }

  public boolean isEmpty() {
    if (first == null) System.out.println("List is empty...");
    return (first == null);
  }

  public void displayForward() {
    if (isEmpty()) return;

    System.out.print("first -> last: ");

    int i = 0;
    Link current = first;
    while (current != null) {
      System.out.printf(" %d", current.iData);
      current = current.next;
      i++;
    }

    System.out.printf("  : %2d elements \n", i);
  }

  public void displayBackward() {
    if (isEmpty()) return;

    System.out.print("last -> first: ");

    int i = 0;
    Link current = last;
    while (current != null) {
      System.out.printf(" %d", current.iData);
      current = current.previous;
      i++;
    }

    System.out.printf("  : %2d elements \n", i);
  }

  public void insertFirst(int iData) {
    Link newLink = new Link(iData);
    System.out.printf("Insert '%d' to first \n", iData);

    if (isEmpty()) {
      first = newLink;
      last = newLink;
      displayForward();
    }
    else {
      Link next = first;
      first = newLink;

      first.next = next;
      next.previous = first;

      displayForward();
    }
  }

  public void insertLast(int iData) {
    Link newLink = new Link(iData);
    System.out.printf("Insert '%d' to last \n", iData);

    if (isEmpty()) {
      last = newLink;
      first = newLink;
      displayForward();
    }
    else {
      Link previous = last;
      last = newLink;
      last.previous = previous;
      previous.next = last;
      displayForward();
    }
  }

  public Link deleteFirst() {
    System.out.printf("Delete first \n");
    if (isEmpty()) {
      return null;
    }
    else if (first == last) {
      Link removedLink = last;
      first = null;
      last = null;
      displayForward();
      return removedLink;
    }
    else {
      Link removedLink = first;
      Link next = first.next;
      first = next;
      first.previous = null;
      displayForward();
      return removedLink;
    }
  }

  public Link deleteLast() {
    System.out.printf("Delete last \n");
    if (isEmpty()) {
      return null;
    }
    else if (first == last) {
      Link removedLink = last;
      first = null;
      last = null;
      displayForward();
      return removedLink;
    }
    else {
      Link removedLink = last;
      Link previous = last.previous;

      last = previous;
      last.next = null;
      displayForward();
      return removedLink;
    }
  }

  public Link find(int iData) {
    System.out.printf("Find link '%d' \n", iData);
    int i = 1;
    Link current = first;
    Link foundLink = null;

    while (current != null) {
      if (current.iData == iData) {
        System.out.printf("Founnd link '%d' in position #%d \n", iData, i);
        break;
      }
      else {
        current = current.next;
        i++;
      }
    }

    if (current == null) {
      System.out.printf("Link '%d' not found \n", iData);
      displayForward();
    }
    else {
      foundLink = current;
    }

    return foundLink;
  }

  public Link deleteKey(int iData) {
    System.out.printf("Delete '%d' \n", iData);
    Link removedLink = null;
    Link current = first;

    while (current != null) {
      if (current.iData == iData) {
        break;
      }
      else {
        current = current.next;
      }
    }

    if (current == null) {
      System.out.printf("'%d' not found \n", iData);
      displayForward();
    }
    else if (first == last) {
      removedLink = first;
      first = null;
      last = null;
      displayForward();
    }
    else if (current == first) {
      removedLink = first;
      Link next = removedLink.next;

      first = next;
      first.previous = null;
      displayForward();
    }
    else if (current == last) {
      removedLink = last;
      Link previous = removedLink.previous;

      last = previous;
      last.next = null;
      displayForward();
    }
    else {
      removedLink = current;
      Link previous = removedLink.previous;
      Link next = removedLink.next;

      previous.next = next;
      next.previous = previous;
      displayForward();
    }

    return removedLink;
  }


  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

    dll.insertFirst(1);
    dll.insertFirst(2);
    dll.insertFirst(3);

    dll.deleteFirst();
    dll.deleteFirst();

    dll.insertLast(2);
    dll.insertLast(3);

    dll.deleteLast();
    dll.deleteLast();
    dll.deleteLast();

    dll.deleteFirst();

    dll.insertFirst(3);
    dll.insertFirst(2);
    dll.insertFirst(1);

    dll.displayBackward();
    dll.displayForward();

    dll.deleteKey(5);
    dll.deleteKey(2);
    dll.deleteKey(3);
    dll.deleteKey(3);
    dll.deleteKey(1);

    dll.insertFirst(3);
    dll.insertFirst(2);
    dll.insertFirst(1);

    dll.find(3);
    dll.find(2);
    dll.find(1);
    dll.find(5);
  }
}
