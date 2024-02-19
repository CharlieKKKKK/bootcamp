package DemoThread;

import java.util.concurrent.atomic.AtomicInteger;

public class CharlieAtomicInteger {

  AtomicInteger atmInt;

  public CharlieAtomicInteger() {
    atmInt = new AtomicInteger();
  }

  public static void main(String[] args) {
    CharlieAtomicInteger charlieAtomicInteger = new CharlieAtomicInteger();
    int result = charlieAtomicInteger.atmInt.incrementAndGet();
    System.out.println(result);

    Runnable AtomicIncrement = ()->{
      for(int i = 0 ; i < 1_000_000 ;i++){
        charlieAtomicInteger.atmInt.incrementAndGet();
      }
    };

    charlieAtomicInteger.atmInt.set(0);//reset to 0
    Thread worker1 = new Thread(AtomicIncrement);
    Thread worker2 = new Thread(AtomicIncrement);

    worker1.start();
    worker2.start();

    try{
      worker1.join();
      worker2.join();
    }catch(InterruptedException e){

    }
    System.out.println(charlieAtomicInteger.atmInt.get());
  }
}
