package DemoClass;

public class CharlieStringBuilder {
  public static void main(String[] args) {

    // +=
    // concat()
    String x = "abc";
    x += "def";
    x = x.concat("def");
    System.out.println(x);// abcdefdef

    // StringBuilder
    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("def");
    System.out.println(y.toString());// abcdefdef

    int counter = 4;
    StringBuilder K = new StringBuilder("");
    int num = 0;
    while (counter-- > 0) {
      // K.append(++num).append(++num).append(++num);

      for (int i = 0; i < 3; i++) {
        K.append(++num);
      }
      if (counter > 0)
        K.append(" ");
    }
    System.out.println(K.toString());

    counter = 4;
    StringBuilder L = new StringBuilder("");
    char z = 'a';
    while (counter-- > 0) {
      for (int i = 0; i < 3; i++) {
        L.append(z);
      }
      if (counter > 0) {
        L.append(" ");
      }
      z++;
    }
    System.out.println("1= " + L);
    System.out.println(L.toString());// aaa bbb ccc ddd

    System.out.println(L.reverse().toString());// ddd ccc bbb aaa

    System.out.println(L.insert(4, "bootcamp").toString());
    // ddd bootcampccc bbb aaa
    System.out.println(L.delete(0, 6).toString());
    // otcampccc bbb aaa
    L.setCharAt(2, 'J');
    System.out.println(L.toString());
    System.out.println(L.charAt(2));// J

    System.out.println(L.toString());// otJampccc bbb aaa
    L.replace(2, 6, "abc");
    System.out.println(L.toString());// otabcccc bbb aaa

    System.out.println(L.isEmpty());// false
    System.out.println(L.length());// 16
    System.out.println(L.substring(0, 3));// ota

    StringBuilder S1 = new StringBuilder("abc");
    StringBuilder S2 = new StringBuilder("abc");
    System.out.println(S1.equals(S2));// false ******
    System.out.println(S1.toString().equals(S2.toString()));// true ****

    System.out.println(S1.compareTo(S2));// 0

  }

  public static long StringConcat() {
    long start = System.nanoTime();
    String s = "";
    for (int i = 0; i < 1000; i++) {
      s = s.concat("a");
    }
    long end = System.nanoTime();
    return end - start;
  }

  public static long nanoTime() {
    long start = System.nanoTime();
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      s.append("a");
    }
    long end = System.nanoTime();
  }

}