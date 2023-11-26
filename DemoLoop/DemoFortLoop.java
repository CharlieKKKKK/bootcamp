package DemoLoop;

public class DemoFortLoop {
  public static void main(String[] args) {

    int x = 2;
    // counter initialization ; counter's condition ; counter's movement
    // step 1: int i = 0;
    // Step 2: i ， 4 ??
    // step 3: Yes -> x *= 2

    // step 4: sysout
    // step 5: i++
    // step 6: i< 4 ?? i is 1
    // step 7: Yes -> x *= 2

    // step 8: sysout
    // step 9: i++
    // step 10: i< 4 ?? i is 2
    // step 11: Yes -> x *= 2

    // step 12: sysout
    // step 13: i++
    // step 14: i< 4 ?? i is 3
    // step 15: Yes -> x *= 2

    // step 16: sysout
    // step 17: i++
    // step 18: i< 4 ?? i is 4
    // step 19: No -> exit loop

    for (int i = 0; i < 4; i++) {
      x *= 2;
      System.out.println("x=" + x);
    }

    // x *= 2;
    // System.out.println("x=" + x);
    // x *= 2;
    // System.out.println("x=" + x);
    // x *= 2;
    // System.out.println("x=" + x);// 32

    // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
    int total = 0;

    for (int i = 0; i < 11; i++)
      total += i;

    System.out.println("total=" + total);// 55

    // 0 + 2 + 4 + 6 + ... + 10 -> total
    int total2 = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0)
        total2 += i;
    }
    System.out.println("total2=" + total2);// 30

    // 0-100
    // i) 0 -50 , odd -> sum1
    // ii) 51-100, even -> another sum2
    // total -> sum1 * sum2

    total = 0;
    int sum1 = 0;
    int sum2 = 0;
    // for (int A = 0 ; A < 50 ; A++){
    // if (A % 2 != 0)
    // sum1 += A; }

    // for (int B = 51 ;B < 101 ; B++){
    // if (B % 2 == 0)
    // sum2 += B; }

    for (int i = 0; i < 101; i++) {
      if (i > 51) {
        if (i % 2 == 1) {
          sum1 += i;
        }
      }

      else {
        if (i < 101) {
          if (i % 2 == 0) {
            sum2 += i;
          }
        }
      }
      System.out.println("sum1=" + sum1);
      System.out.println("sum2=" + sum2);

      total = sum1 * sum2;
      System.out.println("total3=" + total);
    }

    // continue
    // sum up all odd number (0-100)
    int sum = 0;
    for (int i = 0; i < 101; i++) {// 0,1,2,3,4...100
      // skip even number: continue
      if (i % 2 == 0)
        continue; // Go to the next iteration, skip the rest of codes

      // For even number, the following code will skipped
      sum += i;
    }
    System.out.println("sum=" + sum);

    // break

    // break -> exit the loop the directly
    for (int i = 0; i < 4; i++) {
      if (i == 2) {
        break;
      }
      System.out.println("i=" + i);
    }
    // i = 0
    // i = 1

    // continue -> go to the next iteration of i
    for (int i = 0; i < 4; i++) {
      if (i == 2) {
        continue;
      }
      System.out.println("i=" + i);
    }
    // i = 0
    // i = 1
    // i = 3

    // sum up odd number from 0 (0-100) before the sum reaching 200.
    // Finally, the sum must be <= 200
    // the loop shoud be ended at which number of i?
    int m = 0;
    int num = 0;
    for (int i = 0; i < 101; i++) {
      // skip even number
      if (i % 2 == 0) {
        continue;
      }
      // add up odd number
      m += i;
      // check if sum > 200, if yes, exit loop
      if (m > 200) {
        m -= i;
        break;
      }
      num = i;
    }
    System.out.println("sum=" + m + ", i=" + num);

    String str = " abc pol ijk def xyz";
    char target = 'f';
    int n = 0;
    boolean isFound = false;
    for (int i = 0; i < str.length(); i++) {// charAt(i)
      if (str.charAt(i) == target) {
        n = i + 1;
        isFound = true;
        break;
      }
    }

    if (isFound) {
      System.out.println("Found " + target + " at the " + n + "th character");
    } else {
      System.out.println("Not found");
    }

  }
}