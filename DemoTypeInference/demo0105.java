package DemoTypeInference;

import java.util.ArrayList;
import java.util.List;

public class demo0105 {
  public static void main(String[] args) {
    String s = "hello";
    var s2 = "hello"; // after compile: var -> String
    var dog2 = new Dog("Test");
    // dog = "dog"; // error

    // if the object reference is declared by "var", we have to assign value at the same time.
    // var n;
    // var = null;
    // int n2;

    // s = 123; // error
    // s2 = 123; // same, error, s2 is declared before, and pointing to a String object
    // cannot be reassigned to int value object

    var result = add(3, 4);

    List<Dog> dogs = new ArrayList<>(List.of(new Dog("ABC"), new Dog("DEF")));

    for (Dog dog : dogs) {
      System.out.println(dog.getName());
    }

    for (var dog : dogs) {
      System.out.println(dog.getName());
    }
  }

  public static int add(int x, int y) {
    return x + y;
  }

  // We cannot use var as return type
  // public static var add(int x, int y) {
  // return x + y;
  // }

  // We cannot use var as input param
  // public static int add(var x, var y) {
  // return x + y;
  // }
}
