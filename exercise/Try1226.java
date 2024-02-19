package exercise;

import java.util.Arrays;

public class Try1226 {
  public static void main(String[] args) {
    String A = "charlie is fat";
    char B = 'a';
    int count = 0;
    char[] X = A.toCharArray();
    for (int i = 0; i < X.length; i++) {
      if (X[i] == B)
        count++;
    }
    System.out.println(count);

    String A1 = "charlie";

    char[] XXX = new char[A1.length()];
    for (int i = 0; i < XXX.length; i++) {
      XXX[i] = A1.charAt(i);
    }
    char B1 = 'r';
    for (int i = 0; i < XXX.length; i++) {
      if (XXX[i] == B1)
        System.out.print("OK");
    }

    int[] arr = new int[] { -20, 120, 50, -99, 48, 8, 78 };
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    // method2
    int[] arr2 = new int[] { -20, 120, 50, -99, 48, 8, 78 };
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
