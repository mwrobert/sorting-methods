package org.robert;

import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Random rand = new Random();
    int range = 100000;
    Integer[] numbers = new Integer[range];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(range);
    }


    System.out.println("Sorting...");
    double startTime = System.currentTimeMillis();

    BubbleSort.sort(numbers);
    //QuickSort.sort(numbers);

    double stopTime = System.currentTimeMillis();

//   for (Integer num : numbers) {
//     System.out.println(num);
//   }

    System.out.println("Done sorting in: " + (stopTime - startTime)/1000 + " [s]");

  }

}