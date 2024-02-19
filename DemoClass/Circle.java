package DemoClass;

import java.math.BigDecimal;

public class Circle {
  
  private double radius; //半徑
  private String colour;

  public Circle(){}

  public Circle(double radius) {
    this.radius = radius;
    }
    public Circle(String colour){
      this.colour = colour;
    }


    public void setradius(double radius){
      this.radius = radius;
    }
    public double getradius(){
      return this.radius;
    }

    public void setcolour(String colour){
      this.colour = colour;
    }
    public String getcolour(){
      return this.colour;
    }

    public double diameter(){
      return this.radius*2;//this????
    }
    public double area(){
      //return
      return Math.pow(this.radius,2)*Math.PI;//??????
    }

    //Static Method 12/6
    public static double area(double radius){
      BigDecimal R = BigDecimal.valueOf(radius);
      BigDecimal PI = BigDecimal.valueOf(Math.PI);
      return R.multiply(R).multiply(PI).doubleValue();
    }

    private static int valueOf(BigDecimal r) {
      return 0;
    }

    public static void main(String[] args) {
      Circle c1 = new Circle();
      c1.setradius(3.2d);
      System.out.println(c1.getradius());

      Circle circle2 = new Circle(3.4d);
      System.out.println(circle2.getradius()); // 3.4

      double diameter1 =c1.diameter();
      double area1 = c1.area();
      System.out.println(diameter1);
      System.out.println(area1);
      //pass by reference
      c1=circle2;

      double radiusOfCircle1 = 3.0;
      double AreaOfCircle1 = radiusOfCircle1 * radiusOfCircle1 * 3.14;
      System.out.println(AreaOfCircle1);
    }
}
