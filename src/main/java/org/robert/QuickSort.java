package org.robert;

import java.util.Random;

public class QuickSort {

  public static <T extends Comparable<? super T>> void sort(T[] array) {
    sort(array, 0, array.length - 1);
  }

  private static <T extends Comparable<? super T>> void sort(T[] array, int lowIndex, int highIndex)  {

    if (lowIndex >= highIndex){
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    T pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);

    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    sort(array, lowIndex, leftPointer -1);
    sort(array, leftPointer + 1, highIndex);

  }

  private static <T extends Comparable<? super T>> int partition(T[] array, int lowIndex, int highIndex, T pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while (leftPointer < rightPointer) {

      while (array[leftPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer) {
        leftPointer++;
      }

      while (array[rightPointer].compareTo(pivot) >= 0 && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);

    }
    swap(array, leftPointer, highIndex);
    return leftPointer;
  }

  private static <T> void swap(T[] array, int index1, int index2) {
    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

}
