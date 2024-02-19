package DemoGenerics;

public class IntegerPrinter {

  private Integer x;

  public IntegerPrinter(Integer x){
    this.x=x;
  }
  public Integer getX(){
    return this.x;
  }
  
  public static void main(String[] args) {
    IntegerPrinter p = new IntegerPrinter(10);
    System.out.println(p.getX());

    Object o = p.getX();
  }
}
