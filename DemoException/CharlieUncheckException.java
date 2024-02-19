package DemoException;

public class CharlieUncheckException {
  public static void main(String[] args) {
    double result;
    try {
      result = divide(10.0d, 0.0d);
    } catch (ArithmeticException e) {
      result = 0.0d;
    }

  }

  public static double divide(double x, double y) {
    return x / y;
  }
}
