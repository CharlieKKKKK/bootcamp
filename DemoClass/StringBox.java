package DemoClass;

public class StringBox {
  private char[] characters;// objest reference type ????????

  public StringBox(String str) {
    this.characters = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      characters[i] = str.charAt(i);// ?????????????
    }
  }

  public String toString() {
    return String.valueOf(this.characters);
  }

  public StringBox concat(String str) {
    int idx = 0;
    char[] newArr = new char[this.characters.length + str.length()];
    for (int i = 0; i < this.characters.length; i++) {
      newArr[idx++] = characters[i];
    }
    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = str.charAt(i);
    }
    return new StringBox(String.valueOf(newArr));
  }

  public int length() {
    return this.characters.length;
  }

  public boolean isEmpty() {
    // check if the char[] is empty
    return this.characters.length == 0;
  }

  public static void main(String[] args) {
    StringBox String = new StringBox("hello");
    System.out.println(String.toString());
    String = String.concat("world");

  }
}
