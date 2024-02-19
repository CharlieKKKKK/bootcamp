package DemoClass.staticVariable;

import java.util.Arrays;

public class Library {
  private static int bookCounter = 0;
  private static Librarian librarian;
  private Book[] books;

  public Library(Librarian librarian) {
    this.books = new Book[0];
    Library.librarian = librarian;
  }

  public String librarianName() {
    return librarian.getName();
  }

  public int bookCount() {// instance method can access static variable
    return bookCounter;
  }

  public void addbook(Book book) {
    bookCounter++;
    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
    newBooks[newBooks.length - 1] = book;
    // this.books = newBooks;
  }

  public static void main(String[] args) {
    Librarian librarian = new Librarian("Jenny");
    Library library = new Library(librarian);
    library.addbook(new Book());
    System.out.println(library.bookCount());// 1
    library.addbook(new Book());
    library.addbook(new Book());
    System.out.println(library.bookCount());// 3

  }
}
