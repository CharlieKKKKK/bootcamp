package DemoInterFace;

public class Taxi implements Vehicle {

  private int speed;

  private int capacity;

  private Taxi(int speed, int capacity) {

  }

  public static final int MAX_SPEED = 100;

  public static Taxi small() {
    return new Taxi(0, 4);
  }

  public static Taxi big() {
    return new Taxi(0, 5);
  }

  public Taxi(int speed) {
    this.speed = speed;
  }

  // getter
  public int getSpeed() {
    return this.speed;
  }

  // setter ?
  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxStopped() {
    return this.speed > Taxi.MAX_SPEED;
  }

  @Override
  public boolean start() {
    if (isOn())
      return false;
    this.speed = 10;
    return true;

  }

  @Override
  public boolean stop() {
    if (isStopped())
      return false;
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate() {
    if (isStopped())
      return false;
    this.speed += 10;
    if (isOverMaxStopped())
      this.speed = Taxi.MAX_SPEED;
    return true;
  }

  @Override
  public boolean brake() {
    if (isStopped())
      return false;
    this.speed -= 10;
    return true;
  }

  public static void main(String[] args) {
    Taxi t1 = Taxi.small();
    t1.start();
    t1.accelerate();
    t1.accelerate();
    t1.brake();
    t1.stop();

    System.out.println(t1.getSpeed()); // 10
  }
}
