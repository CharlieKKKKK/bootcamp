package DemoArray;

public class CharlieCounting {
  public static void main(String[] args) {
    // 11/28
    int[] numbers = new int[] { 10, 2, 200, 2000, 2000, 2, 2 };
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println(max); // 2000
    System.out.println(min);// 2

    int maxCount = 0;
    int[] counts = new int[max - min + 1];// 1999
    for (int i = 0; i < numbers.length; i++) {
      if (counts[i] != 0 && counts[i] > maxCount) {
        maxCount = counts[i];
      }
    }
    // int[] counts = new int[];

    System.out.println("Max.count=" + maxCount); // 3

    String str = "abcabcdpolxyzaa";
    char maxChar= ' ';
    maxCount = 0 ;
    int counts2[] = new int[26];
    counts2['b'-'a']++;
    
    System.out.println("Max.count" + maxCount + ", char=" + maxChar); // 4

  }
}
