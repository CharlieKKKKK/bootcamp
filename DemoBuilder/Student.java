package DemoBuilder;

import java.util.List;

public class Student {
  // why要開個class咁樣處理優化>>>>>個setter都可以做到(例子:Staff.java)>>>>>>>因為保留番void
  // Staff 可以改名，呢個封鎖左
  // Builder Pattern Advantages:
  //1.If you want to control the access to setter after the object created, builder pattern is
  //2. you don't have to create too much contructors, according to the attributes
  private String name;

  private int age;

  private List<String> subjects;

  private Student(String name, int age, List<String> subjects) {
    this.name = name;
    this.age = age;
    this.subjects = subjects;
  }

  public Student(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.subjects = builder.subjects;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String name;
    private int age;
    private List<String> subjects;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder subjects(List<String> subjects) {
      this.subjects = subjects;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

  public static void main(String[] args) {

    Student student =
    new Student("John")
  }
}
