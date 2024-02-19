package exercise;

import java.util.Arrays;

public class CharlieQ10 {
  public static void main(String[] args) {
    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
    my_array[9] =120;
    int temp;
    for (int i =9;i > 3;i-- ){
      temp = my_array[i];
      my_array[i] = my_array[i-1];
      my_array[i-1]= temp;
    }
    System.out.println(Arrays.toString(my_array));
  }
}
