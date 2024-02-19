package internalcache;

import java.math.BigDecimal;


public class Circle extends Shape {

  private double radius;

  public Circle() {
    // super(); // calling Shape()
  }

  public Circle(double radius) {
    // super(); // calling Shape()
    this.radius = radius;
  }

  public Circle(double radius,String color){
    super(color);
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }
  public static void main(String[] args) {
    Circle circle = new Circle(3.4d, "RED");
    System.out.println(circle);
  }

  public double getRadius() {
    return this.radius;
  }
}
