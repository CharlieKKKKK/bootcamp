package DemoRecursion;

public class CharlieRecursion {
  public static void main(String[] args) {
    // 1+2+3+4+5 >> 15
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      sum += i;
    }
    System.out.println(sum);

    // recursion: Given int n, return n + (n - 1) + (n -2) + ... + 1
    System.out.println(sum(5));
    System.out.println(multiply(7));

    // recursion: Given int n
    // if n is odd, return n * (n - 2)*(n - 4)* ... *1
    // if n is even, return n * (n - 2)*(n - 4)* ... *2
  }

  // Time/ Space complexity??
  public static int sum(int n) {// n = 5
    // base criteria
    if (n == 1)
      return 1;
    return n + sum(n - 1);
  }

  public static int multiply(int n) {
    int total = 0;
    if (n <= 1) {
      return 1;
    }
    if (n % 2 == 0) {
      total = n * multiply(n - 2);
      return total * 2;
    }
    return n * multiply(n - 2);
  }
}
