package DemoThread;

public class SharedResource {
  private boolean hasData = false;// Shared Resource

  public synchronized void produce() throws InterruptedException {// 如果冇野既話produce
    while (hasData) {
      wait();
    }
    System.out.println("Producing data...");
    Thread.sleep(2000);
    hasData = true;
    notify();
  }

  public synchronized void consume() throws InterruptedException {// 如果有野既話consume
    while (!hasData) {
      wait();// Object.wait() notify()
    }
    System.out.println("Consuming data...");
    Thread.sleep(2000);
    hasData = false;
    notify();
  }

  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();

    Runnable produceData = () -> {
      while (true) {
        try {
          sharedResource.produce();
        } catch (InterruptedException e) {

        }
      }
    };

    Runnable consumeData = () -> {
      while (true) {
        try {
          sharedResource.produce();
        } catch (InterruptedException e) {

        }
      }
    };

    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();
  }
}
