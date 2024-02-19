package DemoClass;

//bluepruint, to produce Person objects
public class Person {

  // Attributes
  private String lastName;
  private String firstName;
  private int age; // 0

  // Constructor (Produce Person's object)
  public Person() {

  }

  public Person(String firstName) {
    this.firstName = firstName;
    this.lastName = "";
  }

  public Person(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public Person(String lastName, String firstName, int age) {
    //this.lastName = lastName;
    //this.firstName = firstName; //兩種寫法
    this(lastName,firstName);
    this.age = age;
  }

  // Instance Method
  // 1. Belongs to the object (Person p1 = new Person(); p1.swim();)
  // 2.Able to control the instance variable by "this"

  // Static Method
  // 1. Belongs to the class (ClassName.staticMethod() -> Person.swim(3))
  // 2.Not able to read/write instance variable
  // 3.The return value completely derived by the input parameters

  // Instance Method (Object method)
  // Setter
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // Getter
  public String getLastName() {
    return this.lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getFullName() {
    // if lastName -> "", return "John"
    // if lastName -> "x", return "John X"
    if (this.lastName == null)
      return this.firstName;
    return this.lastName.isEmpty() ? this.firstName
        : this.firstName.concat(" ").concat(this.lastName);
  }

  public String getFullName(boolean isCapLetter) {
    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
  }

  public String getFullName2() {
    return String.valueOf(this.firstName.charAt(0)).toUpperCase()
        .concat(this.firstName.substring(1, this.firstName.length()))
        .concat(" ") //
        .concat(String.valueOf(this.lastName.charAt(0))).toUpperCase()
        .concat(this.lastName.substring(1, this.lastName.length()));
  }

  public static void swimming() {

  }

  public void swim() {// Void可以return or 唔return
    int a = 1;
    if (a > 2)
      return;
    System.out.println(this.firstName + "is swimming.");
  }

  public int eat() {// int method 需要return
    int b = 10;
    if (b < 12) {
      return 100;
    }
    return -1;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setFirstName("John");
    Person p2 = new Person();
    p2.setFirstName("Peter");

    Person p3 = p1;
    p3.setFirstName("Mary");

    Person p4 = new Person("Tommy");
    p4.setFirstName("Jenny");
    System.out.println(p4.getFirstName()); // "Jenny"
    System.out.println(p3.getFirstName()); // "Mary"
    System.out.println(p1.getFirstName()); // "Mary"
    System.out.println(p2.getFirstName()); // "Peter"

    Person p5 = new Person("Ken", "Wong");
    System.out.println("p5 full name=" + p5.getFullName()); // "Ken Wong"
    System.out.println("p5 full name=" + p5.getFullName(true)); // "KEN WONG"
    System.out.println("p5 full name=" + p5.getFullName(false)); // "ken wong"

    // S

  }
}