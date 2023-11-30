package 
import java.util.Arrays;

public class Charlie1128 {
  public static void main(String[] args) {
    
    int[] arr = new int[] {100, -100, 34};

    // for loop
    // {-100, 100, 34}
    int temp;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        // swapping
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));

    // move target index value to the tail of the array
/*     int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // expected result = {100, 4, 100, 500, -20}
    // for loop
    for (int i = 0; i < arr2.length; i++) {
if (arr2[i] > 0)
    } */

    // continue, break
    //1,3,5,7,9
     int j=0;
     while ( j < 10){
      if (j % 2 == 0);
      continue;
         System.out.println(j);
     }




  }
}
