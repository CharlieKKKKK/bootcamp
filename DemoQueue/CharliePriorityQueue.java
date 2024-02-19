package DemoQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class CharliePriorityQueue {
  public static void main(String[] args) {
    Queue<String> qs = new PriorityQueue<>();

    qs.add("hello");
    qs.add("a");
    qs.add("x");
    qs.poll();
    System.out.println(qs);
  }
}
