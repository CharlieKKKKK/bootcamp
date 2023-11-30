package DemoArray;

import java.util.Random;
import java.util.Scanner;

public class CharlieRandom {
  public static void main(String[] args) {
    int target = new Random().nextInt(100);
    System.out.println("random number=" + target); // 0.1.2

    target = new Random().nextInt(100) + 1;
    System.out.println("random number=" + target); // 1-100

    // Game
    // 1-100 (random target:47)
    // Round 1:"Plase input a number (1-100):" User input 49 (wrong)
    // Round 2:"Plase input a number (1-48):" User input 35 (wrong)
    // Round 3:"Plase input a number (36-48):" User input 47 (correct)

    // if the input number is out of of the range being asked, keep asking

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    // while loop
    // if user input same as target -> exit
    // otherwise, keep asking
    int min = 1;
    int max = 100;
    do {
      System.out.println("please input a number (" + min + "-" + max + ")");
      input = scanner.nextInt();
      if (input < min || input > max){
        System.out.println("Out of range.Please input again")
    }
 

    }



}
}