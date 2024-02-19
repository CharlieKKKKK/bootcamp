package DemoException;

import java.io.IOException;

public class CharlieMultipleMethod {
  public static void main(String[] args) {
    try{
    System.out.println(methodA(5, 4));
    }catch(Exception e){
      if(e instanceof IOException){
        System.out.println("e is IOE");
      }
    }
  }

  public static int methodA(int x, int y) throws Exception{
    // call methodB
    return methodB(x, y);
  }

  public static int methodB(int x, int y) throws Exception{
    // call methodC
    return methodC(x, y);
  }

  public static int methodC(int x, int y) throws Exception {
    // what is the difference of throwing checked or unchecked exception in methodC?

    String z = "";
    int xx = Integer.parseInt(z);
    
    if (x + y > 10)
      return x + y;
    throw new IOException();
  }
}
