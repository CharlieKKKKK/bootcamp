package DemoArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CharlieLinkedList {
  public static void main(String[] args) {
    LinkedList<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("XYZ");
    ls.add("IJK");
    System.out.println(ls);//[ABC, XYZ, IJK]

    ls.remove();
    System.out.println(ls);//[XYZ, IJK]
    ls.removeLast();
    System.out.println(ls);//[XYZ]

    List<String> l = new LinkedList<>();
    l.add("ABC");
    l.add("XYZ");
    l.add("IJK");
    System.out.println(l);//[ABC, XYZ, IJK]

    l.remove(2);
    System.out.println(l);//[ABC, XYZ]
    l.remove("XYZ");
    System.out.println(l);//[ABC]

    //for-eash....

  }
}
