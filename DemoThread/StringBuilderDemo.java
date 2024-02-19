package DemoThread;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    StringBuffer sbf = new StringBuffer();

    sbf.append("hello").append("world");
    System.out.println(sbf.toString());

    // StringBuilder
    Thread task1 = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        sb.append("x");
      }
    });

    // StringBuffer
    Thread task2 = new Thread(() -> {
      for (int i = 0; i < 1_000_000; i++) {
        sbf.append("x");
      }
    });
    sbf.setLength(0);
    task1.start();
    task2.start();

   
 try {
      task1.join();
      task2.join();
    } catch (InterruptedException e) {

    }
    System.out.println("StringBuilder =" + sb.length());
    System.out.println("StringBuffer =" + sbf.length());

  }
}
