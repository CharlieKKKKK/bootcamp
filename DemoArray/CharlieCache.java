package DemoArray;
public class CharlieCache {
  public static void main(String[] args) {
    
    String s1 = "john";
    String s2 = "john";

    System.out.println(s1.equals(s2));//true (same value)
    // == , cheak if they are same object
    System.out.println(s1 == s2); // true ,check if s1 and s2 are ssame object

    String s3 = new String("john");
    System.out.println(s1.equals(s3));//true (same value)
    System.out.println(s1 == s3); // false (different objects)

    String s4 = String.valueOf("john");
    System.out.println(s1.equals(s4));//true (same value)
    System.out.println(s1 == s4);//true //s4's String objest is in Literal Pool
    System.out.println(s2 == s4);//true //s4's String objest is in Literal Pool
    System.out.println(s3 == s4);//false

    s1 = "john2";
    System.out.println(s1 == s4);//false
    System.out.println(s2 == s4);//true

    s2 =s2 + "3"; // "john3"
    System.out.println(s2 == s4);//false

    s2 = "john";
    s2 = s2 + "2"; // "john2"
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1 == s2);//false

}
}