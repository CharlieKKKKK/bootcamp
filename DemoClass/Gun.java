package DemoClass;

public class Gun {

  private String name;

  private int AttackPower;

  public Gun() {
  }

  public Gun(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Gun(int AttackPower) {
    this.AttackPower = AttackPower;
  }

  public void setAttackPower(int AttackPower) {
    this.AttackPower = AttackPower;
  }

  public int getAttackPower() {
    return this.AttackPower;
  }

  public static void main(String[] args) {
    Gun g1 = new Gun();
    g1.setName("m4");
    Gun g2 = new Gun();
    g2.setName("AK");
    System.out.println(g2.getName());
  }

}
