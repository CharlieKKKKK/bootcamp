package DemoObject;

import java.util.Objects;

public class Cat {

  private String name;
  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override // override 邊度
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))// instanceof 咩意思
      return false;
    Cat cat = (Cat) obj;// 味搞清楚攞輯，點解Object 要downcase
    // return cat.getAge() == this.age && cat.getName().equals(this.name);//
    // *****String 唔可以用==
    return Objects.equals(cat.getAge(), this.age)
        && Objects.equals(cat.getName(), this.name);// 呢個寫法好D，比較唔會有equals/ == 既問題
    // 上面呢個method係想，定義相同AB 係一個object
  }

  public static void main(String[] args) {
    Object c1 = new Cat("ABC", 10);
    Cat c2 = new Cat("ABC", 10);
    Cat c3 = new Cat("ABC", 10);
    Cat c4 = new Cat("AC", 1);
    Cat c5 = new Cat("AB", 100);
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    System.out.println(c1 == c3);
    System.out.println(c1.equals(c4));
    System.out.println(c1.equals(c5));
  }
}
