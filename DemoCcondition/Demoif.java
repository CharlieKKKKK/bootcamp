package DemoCcondition;

public class Demoif {
  public static void main(String[] args) {

    double salary = 15000.0d;
    if (salary > 14000) {
      System.out.println("salary > 14000");
    }

    if (salary > 15000) {// double vs int
      System.out.println("salary > 15000");

    }

    char grade = 'N';
    if (grade == 'A') {
      System.out.println("grade=A");
    } else if (grade == 'B') {
      System.out.println("grade=B");
    } else if (grade == 'C') {
      System.out.println("grade=C");
    } else if (grade == 'D') {
      System.out.println("grade=D");
    } else if (grade == 'E') {
      System.out.println("grade=E");
    } else {
      System.out.println("Fail");
    }

    // 練習
    // >= 90 -> A, >= 80 and < 90 -> B , 70 - 79 -> C, 60 - 69 -> D
    // 50- 59 -> E ,<50 -> F

    int score = 55;

    if (score >= 90 && score <= 100) {
      grade = 'A';
    } else if (score >= 80 && score < 90) {
      grade = 'B';
    } else if (score >= 70 && score < 80) {
      grade = 'C';
    } else if (score >= 60 && score < 70) {
      grade = 'D';
    } else if (score >= 50 && score < 60) {
      grade = 'E';
    } else {
      grade = 'F';
    }

    // Approach 2, remove upper limit

    int score2 = 30;

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else if (score >= 50) {
      grade = 'E';
    } else {
      grade = 'F';
    }

    // 練習2
    // score and score2 >= 50, (score+score2)/2 -> grade
    // either score or score2 < 50 -> grade F
    // both score and score2 < 50 -> grade F
    if (score < 50 || score2 < 50) {
      grade = 'F';
    } else {
      int AverageScore = (score + score2) / 2;
      if (AverageScore >= 90) {
        grade = 'A';
      } else if (AverageScore >= 80) {
        grade = 'B';
      } else if (AverageScore >= 70) {
        grade = 'C';
      } else if (AverageScore >= 60) {
        grade = 'D';
      } else if (AverageScore >= 50) {
        grade = 'E';
      } else if (AverageScore < 50 || score < 50 || score2 < 50)
        grade = 'F';

      // Vincent版本
    }
    System.out.println("Grade" + grade);
  }
}
