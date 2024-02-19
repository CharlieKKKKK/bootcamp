package DemoObject;

public class CharlieObject {// extend Object implicitly

  public void run() {

  }

  public static void main(String[] args) {
    // Example 1: new DemoObject()

    CharlieObject do2 = new CharlieObject();
    Object o2 = do2; // upcast

    System.out.println(o2.toString()); // DemoObject@6b95977
    // compile time -> o2 is a object ref with the type of Object. Able to itself
    // method
    // rumtime must be Okay if we just use upcast

    // Example 2: new Object()

    Object o1 = new Object();
    System.out.println(o1.toString()); // java.lang.Object@7344699f
    CharlieObject do1 = (CharlieObject) o1; // downcast -> runtime error
    // runtime -> once do1 found the object (new Object()), there is NO run()
    // method.
    // -> error

    // compile time -> do1 is a object ref with the type of DemoObject. Able to call
    // run().
    do1.run();

    // getclass()
    CharlieObject do3 = new CharlieObject();
    if (do3.getClass() == CharlieObject.class) {// instance of
      System.out.println("it is CharlieObject class");
    }
    Class<?> clas = do3.getClass();
    System.out.println(clas.getName());

    //equals()   hashcode()
    String s1 = "hello";
    String s2 = "abc";
    System.out.println(s1 == s2);// check if same object
    System.out.println(s1.equals(s2));// check if same value


    //Cat equals()
  }
}
