package com.byn.practice.SortAlgorythms;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created by byn on 2/21/16.
 */
public class BubbleSortTest {
  private int[] numbers;
  private final static int SIZE = 10;
  private final static int MAX = 100;

  @Before
  public void setUp() throws Exception {
    numbers = new int[SIZE];
    Random generator = new Random();
    for (int i : numbers) {
      i = generator.nextInt(MAX);
    }
  }

  @Test
  public void testBubbleSort() throws Exception {
    BubbleSort sorter = new BubbleSort();
    sorter.bubbleSort(numbers);
    assertTrue(true);
  }
}