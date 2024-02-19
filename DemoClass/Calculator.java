package DemoClass;

import java.math.BigDecimal;

public class Calculator {
  private BigDecimal x;
  private BigDecimal y;

  public Calculator(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public static Calculator of(double x, double y) {
    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }

  public double add(){
    return this.x.add(this.y).doubleValue();
  }
  public double subtract(){
    return this.x.subtract(this.y).doubleValue();
  }
      public double multiply(){
    return this.x.multiply(this.y).doubleValue();
      }
      public double divide(){
    return this.x.divide(this.y).doubleValue();
      }


      //Comparison
      BigDecimal a1 = BigDecimal.valueOf(0.3);
      BigDecimal a2 = BigDecimal.valueOf(0.2);
      if(a1.compareTo(a2)> 0) {
        System.out.println("a1>a2");
      }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));
    Calculator c2 = Calculator.of(0.2,0.1);

  }
}
