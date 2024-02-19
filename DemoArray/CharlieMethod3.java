package DemoArray;

import java.sql.Array;
import java.util.Arrays;

public class CharlieMethod3 {
  public static void main(String[] args) {
    int[] beforeArr = new int[] {3, 5, 10};
    System.out.println(sum(beforeArr)); // 18

    System.out.println("beforeArr AddOne(): " + Arrays.toString(beforeArr)); // [3, 5, 10]
    int[] afterArr = addOne(beforeArr);
    System.out.println("afterArr AddOne(): " + Arrays.toString(beforeArr)); // [4, 6, 11]  // Arrays 變String
    System.out.println("afterArr AddOne(): " + Arrays.toString(afterArr)); // [4, 6, 11]


    String before = "abc";
    System.out.println("before= " + before); // abc

    String after = concatHello2(before);

    System.out.println("before= " + before); // abc
    System.out.println("after= " + after); // abchello


  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
// Wrong approach
  public static int[] addOne(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
    return arr;
  }

  // Correct approach
    public static void addOne2(int[] arr) { //pass by Reference //why 用void??
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;  // why 唔洗return??
    } 
  }

// Wrong approach
  public static void concatHello(String s) {// String is "Pass by value"
  s = s.concat("hello");
  }
  // Correct approach
  public static String concatHello2(String s) {// String is "Pass by value"
    s = s.concat("hello");
    return s;
}
// Primitives + Wrapper Classes + String (17 types) -> Pass by value  資料本身不會被更改
// array and classes -> Pass by reference  //??????????????? 會改到本身既地址上面既野

}