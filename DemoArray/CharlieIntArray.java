package DemoArray;

public class CharlieIntArray {
  public static void main(String[] args) {
    int age1 = 20;
    int age2 = 20;
    int age3 = 30;
    int age4 = 28;

    // Define an array (container) to store a list of int number
    // This array (container) can only srore int number
    int[] arr = new int[9]; // [length of array], by index 0 - 8
    // assignment
    arr[0] = 20;
    System.out.println("arr[0]=" + arr[0]);// 20
    arr[1] = 25;
    System.out.println("arr[1]=" + arr[1]);
    arr[8] = 35;
    System.out.println("arr[8]=" + arr[8]);

    System.out.println("arr[2]=" + arr[2]);// 0

    // 規舉
    int a; // local variable
    a = 1; // explicitly assignment
    System.out.println(a);// you have to explicitly assign value before using it

    int[] arr2 = new int[5];
    int[] arr3 = new int[] { 100, 5, 30, 9, -40 };

    double[] arr4 = new double[] { 1.2, 4.5, 4, 23.0 };

    //8 primitives +string
    //char[]
    //boolean[]
    // String[]

    System.out.println(arr2.length);// 5
    //array supports for loop

  }
}
