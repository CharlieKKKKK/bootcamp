package exercise;

/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    int[] arr = new int[10];
    int sum = 0;

    // Write a loop to sum up all value in the int array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
      sum += arr[i];
    }
    System.out.println("The sum is " + sum);
  }
}