package DemoLoop2;

public class CharlieDoWhileLoop {
  public static void main(String[] args) {
    int j = 0;

    while (j <0){ //not fulfill\
      //
    }
    /* for (int i=0; i <0 


    // Do-while:alway execute once, no matter the condition
    do{
      System.out.println("hello");
    }while( j < 5);

    while (++j < 5) {
      System.out.println("j=" + j);
    }  */
    // j = 1
    // j = 2
    // j = 3
    // j = 4

    j = 0;
    do {
      System.out.println("j=" + ++j);
    }while ( j < 5);

  }
}
