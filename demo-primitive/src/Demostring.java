public class Demostring {
  public static void main(String[]args){
    String emailAddress = "jackylamjmc@gmail.com";
    // String s =3; // s is declared by string, so you cannot assign int value
    //int i = "hello";// i is declared by int, you cannot assign String value
    
    System.out.println(emailAddress);// jackylamjmc@gmail.com

    // Operation -> append
    String str = "hello" + " " + "world";
    System.out.println(str);// "hello world"

    //Alway look at the code inside the bracket first
    // Step 1:"hello" + " " + "world" -> "hello world"
    // Step 2:System.out.println() -> Print out
    System.out.println("hello" + " " + "world");// "hello world"

    String str1 = "hello";
    System.out.println(str1); // "hello"
    System.out.println(str1.length()); // 5
    str1 = str1 + "world";
    System.out.println(str1.length()); // 10
    str1 += "!!!";
    System.out.println(str1.length()); // 13


    // if, =, ==
    int x = 0;// means assignment
    int x2 = 3;// means assignment
    if (x ==x2){// == means, asking if they are equals
      //"x == x2" return false,so the flow will not fall into this block
      System.out.println("x is equals to x2");
    
      //do something
    } else{
      System.out.println("x is not equals to x2");
      // sysout is the shortcut for System.out,println()

    }
//String is
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)){ // comparing two string variables
    


      //charAt()
      //4 is an index of String.
      //Example:"hello",h -> index =0
      // e -> index = 1
      // l -> index = 2
      // l -> index = 3
      // o -> index = 4
      char c = s1.charAt(4);//o
      System.out.println(c);

      //what if we always get the last character of the String
      //length() charAt()
 s1 = "Charlie";
//apptoach 1
      int lastCharIndex = s1.length()-1;
      char lastChar = s1.charAt(lastCharIndex);
//apptoach 2
      lastChar = s1.charAt(s1.length()-1);


    }
    // No "-", "*", "/" in String
    // String supports "+", "+="
  }
}
