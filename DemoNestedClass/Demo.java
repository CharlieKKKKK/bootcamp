package DemoNestedClass;



public class Demo {
  public static void main(String[] args) {
    CharlieStaticNestedClass d = new CharlieStaticNestedClass();

    CharlieStaticNestedClass.Calculator c = new CharlieStaticNestedClass.Calculator(100);
    c.add(5);
    System.out.println(c.getX()); // 105

    Calculator calculator = new Calculator();
  }

}
