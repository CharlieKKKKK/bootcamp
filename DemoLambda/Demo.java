package DemoLambda;

public class Demo {
  public static void main(String[] args) {
    Walkable person = new Walkable() {
      @Override
      public void walk() {
        System.out.println("Walking...");
      }
    };
    person.walk();

    //Lambda Expressoin
    //1.we don't need to write down method signature for the walk() method. why?
    //because the interface has only
    Walkable person2 = () ->{
      System.out.println("hello");
      System.out.println("hello world");
    };
    person.walk();
  }
}
