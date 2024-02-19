package DemoQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CharlieQueue {
  public static void main(String[] args) {

    List<String> ls = new LinkedList<>();
    // ls.add, remove, get

    Queue<String> qs = new LinkedList<>();

    Deque<String> ds = new LinkedList<>();
    ds.add("ABC"); // same as addLast()
    ds.add("EFG"); // same as addLast()
    System.out.println(ds.getLast());// EFG
    System.out.println(ds.getFirst());// ABC
    System.out.println(ds);// [ABC, EFG]

    // addFirst
    ds.addFirst("123");
    System.out.println(ds);// [123, ABC, EFG]
    // addLast
    ds.addLast("456");
    System.out.println(ds);// [123, ABC, EFG, 456]
    // pollFirst
    ds.pollFirst();
    System.out.println(ds);// [ABC, EFG, 456]
    // pollLast
    ds.pollLast();
    System.out.println(ds);// [ABC, EFG]

    // peek(),just look up , not retrieval _姐係睇下個value
    System.out.println(ds.peekFirst());//ABC
    System.out.println(ds.peekLast());//EFG

    // removeFirst()
    ds.removeFirst();
    System.out.println(ds);// [EFG]
    // removeLast()
    ds.removeLast();
    System.out.println(ds);// []

    // Difference pollLast() and removeLast()??
    System.out.println("poll element from empty deque: " + ds.poll());// null
    System.out.println("remove element from empty deque: " + ds.remove());// java.util.NoSuchElementException  //呢個盡量唔好亂用

    
  }
}
