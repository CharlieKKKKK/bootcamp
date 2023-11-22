public class text {
  public static void main(String[]args){
    System.out.println("I am going to add two numbers together:");
    int first = 31;
    // declare the second one
    int second = 42;
    

    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);

    // Add two numbers and print it out
    int sum = first + second;
    System.out.println("The sum is " + sum);

    // subtraction
    int subtract = second - first;
    // subtract = first - second
    System.out.println("The subtraction reuslt is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    sum = b1 +b2;
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum);

    // declare two boolean variable with true and false value
    boolean varB = false;
    boolean varC = true;
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);
  }
}
