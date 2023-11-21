public class DemoInt {
  public static void main(String[]args){
    //" " ->String
    System.out.println("Jacky i age");
    System.out.println(2);
    System.out.println(2.3);

    // Jacky and i are both "variable" 變量
    int Jacky = 1996;
    int i = 4;

    // "int age" -> Declaration, int _> "integer"
    // age = 30 -> assignment, asign the integer value 30 to the variable
    int age = 30;

    int level; //Declaration
    level =1; // Assignment
    level =10; // Re-assignment
    // int level; // We cannot re-declare the same variable
    System.out.println(Jacky + i);

    String jacky = "1996";
    String ii = "4";
    System.out.println(jacky+" "+ ii);

    System.out.println(level + Jacky + "easy");

    System.out.println( Jacky - level + "Hi" );

    // Step 1: level = 10 + 3; (because level = 3 before reaching this line)
    // Step 2: level = 13;
    level = level + 3;
    level += 3; // 16 

    level = level -7; // 9
    level -= 7; // 2

    level = level * 3; // 6
    level *= 3; // 18

    level = level / 2; // 9
    level /= 2; // 4
    System.out.println(level);// 4



    level = level +1;//5
    level++;//6
    ++level;//7

    level = level - 1;//6
    level--;//5
    --level;//4

    // the remainder of 5 / 2 -> 1
    int remainder = 5 % 2; // 1
    System.out.println(remainder);


//****先
int result = (5 + 3)/ 2 % 3;
System.out.println("result" + result);//1

result = 5 + 3 / 2 % 3;
System.out.println("result=" + result );//6





    // byte, short, int, long, (primitive)
    byte b = -128; // from -128 to 127
    byte b2 = 127;
   // byte b3 = 128; // 128 is out of range of integer value that can be strored

   short s = -32768;
   short s2 = 32767;
   // short s3 = 32768; 不行原因同上

   //int range (-2147483648 to 2147483647)
   int i1 = -2147483648;
   int i2 = 2147483647;
   //int i3 = 2147483648; 不行原因同上

   // long l0 = 2147483648; // 2147483648 is presentation, but out range of
   long l1 = -9223372036854775808L; // notation L -> long value
   int i5 = 100; // The value 100 has no notation ->default it is an int value
   byte b4 = 100; // Java implicitly convert the to byte
   short s4 = 100; // Java implicitly convert the to short

//儲存數值有4個 

    l1 = l1 + 10L;
    System.out.println(l1); // -9223372036854775808


  }

}
