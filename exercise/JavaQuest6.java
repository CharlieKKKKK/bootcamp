package exercise;

import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int sum = -1;
    int A1 = 1;
    int A2 = 1;
    int[] arr = new int[15];
    int idx = 0;
    arr[idx++] = A1;
    while (idx < 15) {
      sum = A1 + A2;
      A1 = A2;
      arr[idx++] = A2;
      A2 = sum;
    }
    System.out.println(Arrays.toString(arr));

  }
}