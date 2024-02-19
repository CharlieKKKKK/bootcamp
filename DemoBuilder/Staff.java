package DemoBuilder;

public class Staff {
  private String name;
  private int yearOfExp;

  private Staff(String name, int yearOfExp) {
    this.name = name;
    this.yearOfExp = yearOfExp;
  }

  public Staff name(String name) {
    this.name = name;
    return this;
  }

  public Staff yearOfExp(int yearOfExp) {
    this.yearOfExp = yearOfExp;
    return this;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfExp(int yearOfExp) {
    this.yearOfExp = yearOfExp;
  }
}
