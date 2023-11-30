package DemoArray;

public class CharlieMethod {
  //main -> method name
  //pulic -> or private
  //static method -> tool
  // void -> no  return type
  public static void main(String[] args) {
    // javac --> compile command, converting .java -> .class
    // java -> run .class file
    int x = 2;
    int y =10;
    x *= 2; //4
    x += y ;
    System.out.println("x=" + x);//14

    y = 100;
    x =2;
    x *= 2; //4
    x += y ;
    System.out.println("x=" + x);//104


    //Trigger Method
    int result10 = sum(10,3,99);
    int result21 = sum(10,3,'a');
    System.out.println(result10);//
    System.out.println(sum(2, 4));//6
    System.out.println(sum(-10,-30));//-40
    System.out.println(sum(1996,27));//2023
     System.out.println(result21);
     double XXXY =divide3(2.3,5.5);
     System.out.println(XXXY);

      double result5 = divide(10,3);
      System.out.println(result5);
  }


    //Method name: sum
    //return type: int
    // parameters :No parameter, one or more than one parameters
    //f(x1,x2) = x1 +x2
    //y = x1 + x2
    public static int sum(int x1 , int x2){
      int total = x1 + x2;
      return total;
      
    }
    public static int sum(int x1 , int x2, int x3){
      int total = x1 + x2+ x3;
      return total;
    }
    
  public static double divide(double k1, double k2 ){
    double ans =k1/k2;
    return ans;
}
    public static int divide2(int k1, int k2 ){
   int ans =k1/k2;
    return ans;
}
  public static double divide(int k1, int k2 ){
    double ans =(double)k1/k2;
    return ans;
}
    public static int sum(int x1 , int x2, char x3){
      int total = x1 + x2+ x3;
      return total;
    }
  public static double divide3(double k1, double k2 ){
    double ans =k1+k2;
    return ans;
  }
}



