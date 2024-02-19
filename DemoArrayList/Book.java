package DemoArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(book.getName(), this.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.name);
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Book book = new Book("ABC");
    books.add(book);// 只可以放Book 要問!!!!
    books.add(new Book("DEF"));
    books.add(new Book("XYZ"));
    System.out.println(books);

    System.out.println(books.contains(new Book("ABC"))); // 呢度有問題，後面打左一堆野

    boolean found = false;
    for (Book b : books) {
      if ("ABC".equals(b.getName()))
        found = true;
    }

    // remove (Object obj)
    books.remove(new Book("DEF"));
    System.out.println(books);
  }
}
