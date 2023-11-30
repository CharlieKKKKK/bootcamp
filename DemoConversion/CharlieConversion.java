package DemoConversion;

public class CharlieConversion {
  public static void main(String[] args) {
    //11/28
    // byte -> short -> int -> long
    byte b = 2;
    short s1 = b; // ok 呢個過程叫升級，因為冇精度損失，所以OK;upcast, no precision loss
    int i1 = s1;// ok
    long l1 = i1;// ok

    // long -> int -> short -> byte
    long l2 = 4L;
    //short s2 = l2; // NOT OK , potentially precision loss 有"機會"精度損失，所以唔得
    short s2 = (short) l2; // Fixed, Risky
    l2 = 40000 ; // 40000 - > int value
    s2 =(short) l2; // overflow
    System.out.println(s2);//-25536

    short s3 = 130;
    byte b2 = (byte)s3;//overflow -126
    System.out.println(b2);

    int i2 = 130;
    short s4 = (short) i2;

    byte b3 = 127; //int value

    float f1 = (float)1.3d;//downcast
    double d1 =5.2f; //upcast


    //float vs long
    float f2 = 3.5f;
    long l3 = (long)f2; // downcast
    float f3 = 10L; // upcast


    // char vs int 
    int i3 = 'a'; //97 , upcast
    int i4 = 65610; // 65610 -65535
    char c3 = (char) i4 ; //downcast
    System.out.println("c3="+(int)c3);
    System.out.println("c3 (char=)"+c3);



  }
}
