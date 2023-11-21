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

    // "-","*","/"
  }
}
