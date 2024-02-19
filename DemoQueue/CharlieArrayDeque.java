package DemoQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class CharlieArrayDeque {
  public static void main(String[] args) {
    Queue<String> qs = new ArrayDeque<>();
    qs.add("JJJ");
    qs.add("KKK");
    qs.poll();
    System.out.println(qs.peek());//KKK

    Deque<String> ds = new ArrayDeque<>();
    ds.addFirst("ABC");
    ds.addFirst("CBA");
    ds.addFirst("XXX");
    System.out.println(ds);//[XXX, CBA, ABC]
    ds.removeLast();
    System.out.println(ds.pollLast());//CBA  ,呢個係print 依加要poll既element
  }
}
