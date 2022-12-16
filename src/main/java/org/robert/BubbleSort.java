package org.robert;


public class BubbleSort {

  public static <E extends Comparable<? super E>> void sort(E[] array) {

    boolean swappedElement = true;

    while (swappedElement) {
      swappedElement = false;

      for (int i = 0; i < array.length - 1; i++) {
        if (array[i].compareTo(array[i+1]) > 0) {
          swappedElement = true;
          var temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
        }
      }
    }
  }

}
