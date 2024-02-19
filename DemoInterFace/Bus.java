package DemoInterFace;

public class Bus implements Vehicle {

  private int speed;

  public int getSpeed() {
    return this.speed;
  }
  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxStopped() {
    return this.speed > Taxi.MAX_SPEED;
  }
}
