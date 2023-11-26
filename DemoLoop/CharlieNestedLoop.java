package DemoLoop;

public class CharlieNestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {// 0,1,2,3,4
      // System.out.println("*");
      System.out.print("*");
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 7; j++) {
        if (i > 2) {
          break;
        }
        System.out.println("i=" + i + ", j=" + j);
      }
    }

    // i <5
    // j <4
    // System.out.println(); -> print & newline
    // System.out.println(); -> print

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("B");
      }
      System.out.println("");
    }

    // ****
    // ***
    // **
    // *
    //

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4 - i; j++) {// column -> variable length

        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("Example 3:");
    String str = "abcdefghijk";
    int count = 0;
    for (int i = 0; i < str.length(); i++) { // variable length
      // nested loop,4 charactor in a row
      // abcd
      // efgh
      // ijk
      System.out.print(str.charAt(i));
      if (++count % 4 == 0) {
      }
      System.out.println("");

    }

    //
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        // *** *** *** *** *** ***
        System.out.print("*");
      }
      System.out.print(" ");
    }

    int cnt =0;
    for (int i =0; i < 6; i++){
      //if(++cnt % == 0)

    }





  }
}
