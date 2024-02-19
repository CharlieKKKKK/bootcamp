package DemoHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharlieHashMap {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();// 冇意思
    // Map:
    // 1. key value pair -> <key, value> --> one entry
    // 2. key must be unique
    Map<String, Integer> ageBook = new HashMap<>();

    // pull()
    ageBook.put("John", 20);
    ageBook.put("John", 13);// Update 20 -> 13, because "John" is the key which exists in the map
    ageBook.put("Mary", 3);// add a new entry
    System.out.println(ageBook.size());// 2

    for (Map.Entry<String, Integer> entry : ageBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // get()
    System.out.println(ageBook.get("Mary"));// 3
    System.out.println(ageBook.get("John"));// 13

    // 練習 type調轉
    Map<Integer, String> ABC = new HashMap<>();
    ABC.put(18, "KKK");
    ABC.put(17, "OOO");
    ABC.put(1, "ZZZ");
    System.out.println(ABC.size());// 3
    System.out.println(ABC.get(18));// KKK
    for (Map.Entry<Integer, String> entry : ABC.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    // 練習 放個class 入去
    Map<String, Book> EFG = new HashMap<>();// value 個位直接放Class名
    EFG.put("AAA", new Book("java"));
    EFG.put("AAA", new Book("High School"));
    EFG.put("BBB", new Book("code"));

    for (Map.Entry<String, Book> entry : EFG.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getName());
      // 因為想call個書名 , 所以要getName
    }
    // get Book name
    System.out.println(EFG.get("BBB").getName());// code


    //Map<Author,Book>
    Map<Author,Book> QWE = new HashMap<>(); // 兩個class
    QWE.put(new Author("ZZZ"), new Book("XXX"));

    //if there is no equals() & hashCode() -> new entry
    //if there are equals() &  hashCode() -> update
    QWE.put(new Author("ZZZ"), new Book("YYY"));

    System.out.println(QWE.get(new Author("ZZZ")));// Book(name = YYY)

  }
}
