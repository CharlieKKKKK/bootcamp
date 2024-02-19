package DemoNestedClass;

public class CharlieInnerClass { // Outer Class

  private Calculator calculator;

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  public class Calculator { // Inner Class

  }

  public static void main(String[] args) {
    CharlieInnerClass d = new CharlieInnerClass();
    CharlieInnerClass.Calculator c = d.new Calculator();

    CharlieInnerClass.Calculator c2 = new CharlieInnerClass().new Calculator();

    // c = c2;
  }
}