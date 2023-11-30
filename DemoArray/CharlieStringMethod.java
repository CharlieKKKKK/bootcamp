package DemoArray;

public class CharlieStringMethod {
  public static void main(String[] args) {
    String str = "hello world! ";
    //isEmpty
    if(!str.isEmpty()){
      System.out.println("String=" + str );
    }
    System.out.println("str length="+ str.length());

    // even num







    //substring()
    String s =  "hello";
    String newStr = s.substring(2,4);// ll , index start from 0
    System.out.println("newStr=" + newStr);//, print-> index from 

    // trim(), remove all spaces in the head and tail of the string
    // str = " hello world "
    System.out.println(str.trim());//" hello world "
    System.out.println(newStr.trim());// "ll"


    String s2 = "HEllo,woRld!!";
    System.out.println(s2.toUpperCase());//HELlO,WORLD!!
    System.out.println(s2.toLowerCase());//hello,world!!






    //equals()
    //equalsIgnoreCase()
    System.out.println("HEllo,woRld!!".equals("hello,world!!"));//false
    System.out.println("HEllo,woRld!!".equalsIgnoreCase("hello,world!!"));//true
    System.out.println("HEllo,woRld!!".equals("hello"));//false


    // startsWith("")
    // endsWith("")
    System.out.println(s2.startsWith("hEllo"));//true
    System.out.println(s2.startsWith("Hello"));//false
    System.out.println(s2.startsWith("H"));//true
    System.out.println(s2.startsWith(" "));//tfalse
    System.out.println(s2.startsWith(""));//true

    System.out.println(s2.endsWith("woRld!!"));//true
    System.out.println(s2.endsWith("world!!"));//false
    System.out.println(s2.endsWith("!"));//true

    String s3 = "1234567890";
    // you try 2 String methods, and use && operator to check true/false
    // return true
    System.out.println(s3.length() == 10 && s3.startsWith("1"));//true
    System.out.println("56".equals(s3.substring(4,6)) && s3.charAt(s3.length()-1) == '0');


    //indexOf()
    System.out.println(s3.indexOf('7'));//6 (int)
    System.out.println(s3.indexOf('m'));//-1 (int)

    // searching'7' strating from index 8
    System.out.println(s3.indexOf('7',8));// -1 (int)  意思係8開始search



    // lastIndexOf()
    String s4 = "1234512345";
    System.out.println(s4.indexOf('5'));//4, return the first occurence of '5'
    System.out.println(s4.lastIndexOf('5'));//9, return the last occurence of '5'

    System.out.println(s4.indexOf("345"));//2
    System.out.println(s4.indexOf("3 45"));//-1

    System.out.println(s4.lastIndexOf("345"));//7
    System.out.println(s4.lastIndexOf("3 45"));//-1

    System.out.println(s4.lastIndexOf('4',7));//3
    System.out.println(s4.lastIndexOf('4',2));//-1

    String s5 = "ABabcxabcdef";
    System.out.println(s5.lastIndexOf("abc")==6
    && s5.endsWith("def")//
    && s5.indexOf("abc") == 2 //
    && s5.startsWith("ABa")//
    && s5.length() > 10);//true


    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 +s7);//"abcdef"
    System.out.println(s6.concat(s7));// "abcdef"

    System.out.println(s5.contains("abcdef"));//true
    System.out.println(s5.indexOf("abcdef")!= -1);//true

    System.out.println(s5.contains("xxx"));//false

    String result = s5.toUpperCase();
    System.out.println(result);//ABABCXABCDEF
    String result2 = result.substring(3,5);//BC
    System.out.println(result2);

    String result3 = s5.toUpperCase().substring(3,5);//BC
    System.out.println(result3);


    String result4 = s5.toUpperCase().substring(3,5).concat("ijk");
    System.out.println(result4);//Bijk










  }
}
