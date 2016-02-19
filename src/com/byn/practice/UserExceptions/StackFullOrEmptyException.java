package com.byn.practice.UserExceptions;

/**
 * Created by byn on 2/18/16.
 */
public class StackFullOrEmptyException {
  private int currentSize;
  private int maxSize;

  StackFullOrEmptyException(int currentSize, int maxSize) {
    this.currentSize = currentSize;
    this.maxSize = maxSize;
  }

  public String getReason() {
    String aReason = null;
    if (currentSize == -1) {
      aReason = "Stack size = -1 i.e. Empty";
    } else if (currentSize > maxSize) {
      aReason = "Stack is full: " + currentSize + "/" + maxSize;
    }
    return aReason;
  }
}
