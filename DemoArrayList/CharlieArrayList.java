package DemoArrayList;

import java.util.ArrayList;
import java.util.List;

public class CharlieArrayList {
  public static void main(String[] args) {

    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("ACC");
    strings.add("DDF");
    System.out.println(strings.size());// copyOf

    // for - each
    for (String s : strings) {
      System.out.println(s);
    }
    strings.remove(2);
    System.out.println(strings);// [ABC, ACC]
    strings.remove(new String("ABC"));
    System.out.println(strings);// [ACC]

    ArrayList<String> anotherList = new ArrayList<>(List.of("1234", "5588", "9897"));
    strings.addAll(anotherList);
    System.out.println(strings);// [ACC, 1234, 5588, 9897]
    strings.removeAll(anotherList);
    System.out.println(strings);// [ACC]

    strings.add(1, "CCC");
    System.out.println(strings);// [ACC, CCC]
    strings.set(1, "DDD");
    System.out.println(strings);// [ACC, DDD]
    strings.add(1, "EEE");
    System.out.println(strings);// [ACC, EEE, DDD]

    // removedList
    ArrayList<String> removedList = new ArrayList<>(List.of("ACC", "DDD"));
    strings.removeAll(removedList);
    System.out.println(strings);// [EEE]

    strings.addAll(anotherList);// [EEE, 1234, 5588, 9897]
    System.out.println(strings);
    System.out.println(strings.subList(0, 3));// endIndex(exclusive)
    System.out.println(strings.indexOf("5588"));// 放野入去，搵Index

    // List<> is an Interface implemented by ArrayList.class
    List<String> string2 = new ArrayList<>();// 因為List 係Interface，ArrayList可以用入面D method，但都會被限制用List先有既 method
    string2.add("ABC");
    string2.remove(0);
    System.out.println(string2);// []

    if (strings.contains("DDD"));
    {
      System.out.println("contains DDD");
    }
    if (!strings.isEmpty()) {
      strings.add("AAA");
    }
    System.out.println(strings);// [EEE, 1234, 5588, 9897, AAA]
    //
    List<String> arrlist1 = new ArrayList<>(List.of("John", "Mary", "Peter"));
    List<String> arrlist2 = List.of("John", "Mary", "Peter");

    arrlist1.add("Charlie");
    arrlist1.remove("Mary");
    System.out.println(arrlist1);// [John, Peter, Charlie]
    arrlist1.set(1, "Jenny");
    System.out.println(arrlist1);// [John, Jenny, Charlie]

    // arrlist2.add("Charlie");
    // arrlist2.set(1, "Jenny");
    // System.out.println(arrlist2);

    List<String> ls = new ArrayList<>(100); //capacity (array length)
    System.out.println(ls.size());//0
  }
}
