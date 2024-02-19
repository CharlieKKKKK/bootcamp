package DemoStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CharlieStack {
  public static void main(String[] args) {
    // LIFO - stack
    List<String> stack = new Stack<>();
    // 1.

    Stack<String> ss = new Stack<>();
    ss.push("ABC");
    ss.push("IJK");
    // pop -> get the last element
    System.out.println(ss.pop());// IJK
    System.out.println(ss.pop());// ABC
    // System.out.println(ss.pop());//error, we cannot pop an empty stack

    // List 係冇先後概念 ，Stack可以get野
    // 2.

    // 3.Slow
    // Stack
    long start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      ss.push("A");
    }
    long end = System.nanoTime();
    System.out.println("Stack.push() ->" + (end - start));

    start = System.nanoTime();
    ArrayList<String> as = new ArrayList<>();
    for (int i = 0; i < 1000000; i++) {
      as.add("A");
    }
    end = System.nanoTime();
    System.out.println("ArrayList.push() ->" + (end - start));

    start = System.nanoTime();
    LinkedList<String> ls = new LinkedList<>();
    for (int i = 0; i < 1000000; i++) {
      ls.add("A");
    }
    end = System.nanoTime();
    System.out.println("LinkedList.push() ->" + (end - start));
  }
}
