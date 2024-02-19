package DemoClass.staticVariable;

public class Datebass {
  private static String[] strings = new String[0];// Class Data ????????????????
  // instatnce (final vs non-final)
  // int number; -> Setter
  // final int number = 3; -> No setter

  // final vs static final
  // 1. "final" is still instance variable, the object can call it by "this"
  // 2. "static final" is constant

  // No static and No final (instance variable)
  // static
  // final (instance variable)
  // static final
  private final int hoursPerDay = 24; //Constant instance variable
  private static final int MINUTES_PER_HOUR = 60;//Constant   多左個static姐係點?????    大寫既意思     1. instance variable????

  public static void add(String str) {
    String[] newArr = new String[strings.length + 1];
    for (int i = 0; i < strings.length; i++) {
      newArr[i] = strings[i];
    }
    newArr[newArr.length - 1] = str;
    strings = newArr;
  }

  public static String get(int index) {
    if (!isIndexValid(index))
      return null;
    return strings[index];
  }

  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }

  public static boolean remove(int index) {
    if (!isIndexValid(index))
      return false;
    String[] arr = new String[strings.length - 1];
    int j = 0;
    for (int i = 0; i < strings.length; i++) {
      if (index == i)
        continue;
      arr[j++] = strings[i];
    }
    strings = arr;
    return true;
  }

  public String read(int index) {
    return strings[index];
  }

  public static void main(String[] args) {
    // we do not need to create Database object in order to operate static variable
    Datebass.add("hello");
    System.out.println(Datebass.get(0));// hello
    System.out.println(Datebass.get(1));// null

    Datebass d1 = new Datebass();
    Datebass d2 = new Datebass();

    System.out.println(d1.read(0)); // hello
    Datebass.add("world"); // ["hello", "world"]
    Datebass.remove(0); // ["world"]
    System.out.println(Datebass.get(0)); // world
  }
}
