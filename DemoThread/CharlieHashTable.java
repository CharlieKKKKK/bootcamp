package DemoThread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CharlieHashTable {
  public static void main(String[] args) {
    // HashTable (thread safe) vs HashMap (non - thread safe)
    // put()
    Map<String, String> ht = new Hashtable<>();
    Map<String, String> hm = new HashMap<>();

    Runnable putHt = (() -> {
      for (int i = 0; i < 1_000_000; i++) {
        ht.merge("HI", "BYB", (oldVal, newVal)-> oldVal.concat(newVal));
      }
    });

    Runnable putHm = (() -> {
      for (int i = 0; i < 1_000_000; i++) {
        hm.merge("HELLO", "WORLD", (oldVal, newVal)-> oldVal.concat(newVal));
      }
    });

    // Test Hashtable
    Thread worker1 = new Thread(putHt);
    Thread worker2 = new Thread(putHt);
    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(ht.size());

    // Test String Buffer
    worker1 = new Thread(putHm);
    worker2 = new Thread(putHm);

    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(hm.size());

  }
}
