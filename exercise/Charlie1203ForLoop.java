package exercise;

public class Charlie1203ForLoop {
  public static void main(String[] args) {

    // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
    int total = 0;
    for (int i = 0; i < 11; i++) {
      total += i;
    }
    System.out.println(total);

    // 0 + 2 + 4 + ... + 10 -> total
    total = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        total += i;
      }
    }
    System.out.println(total);

    // 0 - 100
    // i) 0 - 50, odd -> sum1
    // ii) 51 - 100, even -> another sum2
    // total -> sum1 * sum2

    total = 0;
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 2 != 0 && i < 51) {
        sum1 += i;
      } else {
        if (i % 2 == 0 && i > 50)
          sum2 += i;
      }
    }
    total = sum1 * sum2;
    System.out.println(total);

    // continue
    // sum up all odd number (0-100)
    total = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 0) {
        continue;
      }
      total += i;
    }
    System.out.println(total);

    // Sum up odd numbers from 0 (0-100) before the sum reaching 200
    // Finally, the sum must be <= 200
    // The loop should be ended at which number of i?
    int sum = 0;
    int number = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
      if (sum + i > 200) {
        sum -= i;
        number = i;
        break;
      }
    }
    System.out.println("sum=" + sum + ",number of i =" + number);
  }
}
