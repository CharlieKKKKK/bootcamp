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

    // 8 primitives +string
    // char[]
    // boolean[]
    // String[]

    System.out.println(arr2.length);// 5
    // array supports for loop

    // array supports for loop
    int b = 100;
    b = 1000;
    System.out.println(b);

    // default value of int[]
    int[] arr5 = new int[3];
    for (int i = 0; i < arr5.length; i++) {
      // arr5 is storing the address of the array object
      // we use arr5[5] find out the 3 values stored in the array object
      arr5[i]= i+1;
      System.out.println("arr5[i]=" + arr5[i]);
      //[0] -> 1
      //[1] -> 2
      //[2] -> 3
    }

    for (int i = arr5.length -1 ; i >= 0; i--){
      //3 2 1
      System.out.println(arr5[i]);//"3 2 1"
      if (i > 0){
        System.out.println(" ");
      }
    }

    String str = "hello";//str is storing the address of String object hello
    String str2 = new String("hello");//str2 is storing the address of String object
    String str3 = String.valueOf("hello");

  }
}
