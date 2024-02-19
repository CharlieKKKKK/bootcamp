package DemoInterFace.exercise1213;

public class Patient implements Hospital {

  private int money;
  private boolean Aggression = false;

  private Patient(int money, boolean Aggression) {
    this.money = money;
    this.Aggression = Aggression;
  }

  public Patient() {

  }

  public int getMoney() {
    return this.money;
  }

  public boolean getAggression() {
    return this.Aggression;
  }

  public static Patient rich() {
    return new Patient(1000, false);
  }

  public static Patient pool() {
    return new Patient(500, false);
  }

  public boolean charge() {
    return this.money > 400;
  }

  public boolean crazy() {
    if(this.money <300){
      Aggression = true;
    }
    return true;
  }

  @Override
  public boolean service() {
    if (charge()) {
      money -= 400;
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean save() {
    if (crazy() || this.Aggression == true)
      return false;
    this.Aggression = false;
    return true;
  }

  public static void main(String[] args) {
    Patient p1 = Patient.rich();
    p1.service();
    p1.service();
    p1.save();

    System.out.println(p1.getMoney());
    System.out.println(p1.getAggression());
  }
}
