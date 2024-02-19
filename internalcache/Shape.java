package internalcache;

import java.math.BigDecimal;

public abstract class Shape {// abstract class vs class
  // Difference
  // 1. Cannot be "new"
  // 2. May contain abstract method(s) , imlicitly public

  // Same
  // 1. Still have instance variables (attributes)
  // 2. Still intance methods
  // 3. Still static methods
  // 4. Must contain constructor , but cannot be "new" , for super() only
  private String color;

  public Shape() {
  }

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  abstract double area(); // imlicitly public

  public static double totalArea(Shape [] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for(Shape shape: shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }
  public static void main(String[] args) {
    Shape s1 = new Circle(3.2d,"Yellow");
 
    System.out.println(s1.area());
    System.out.println(s1.getColor());
    //System.out.println(s1.getRadius());
    Circle c2 =(Circle)s1;
    System.out.println(c2.getRadius());

   Circle c1 = new Circle();
   System.out.println(c1.area());
   System.out.println(c1.getRadius());

  //Shape[] shapes = new Shape[] {}
  }
}
