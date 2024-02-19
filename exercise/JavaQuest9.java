package exercise;
/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    for(int i = 0; i <str.length(); i++){
    if (str.charAt(i) == 'J'){
      System.out.println(str.charAt(i));
      break;
    }
    }
    for(int i = 0; i <str.length(); i++){
    if(str.charAt(i) == 'e'){
      System.out.println(str.charAt(i));
      break;
    }
  }
    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"

    // Use String replace() method
    // prints VenturenixLAB, Coding
    System.out.println(abc.trim());
    
    String newstr = str.replace("Java","Coding");
    System.out.println(str);

    // int length()
    // prints 19
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5,8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    String result = str.toUpperCase();
    System.out.println(result);
    String result2 = str.toLowerCase();
    System.out.println(result2);

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(result.replace("E","*").concat("!!!"));

  }
}