package DemoThread;

public class Calculator {

  private int x;

  public synchronized void increment() {// synchronized 會慢，但係安全
    this.x++;
  }

  public void increment2() {// 冇synchronized ver.
    this.x++;
  }

  public synchronized void decrease() {
    this.x--;
  }
  public static void main(String[] args) {
    // Example 1: increment with synchronized
    Calculator calculator = new Calculator();
    Thread vincent = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        calculator.increment();
      }
    });

    Thread oscar = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        calculator.increment();
      }
    });

    vincent.start();
    oscar.start();

    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x= " + calculator.x);

    // Example 2: increment without synchronized
    // increment2() 既版本
    calculator.x = 0;// reset
    vincent = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        calculator.increment2();
      }
    });

    oscar = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        calculator.increment2();
      }
    });

    vincent.start();
    oscar.start();

    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x= " + calculator.x);

    // Example 3: increment with synchronized and decrease with synchronized
    calculator.x = 0; // reset

    vincent = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.increment();
      }
    });
    oscar = new Thread(() -> {
      for (int i = 0; i < 100_000; i++) {
        calculator.decrease();
      }
    });

    vincent.start();
    oscar.start();

    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException e) {

    }

    System.out.println("calculator.x=" + calculator.x); // 0


}
