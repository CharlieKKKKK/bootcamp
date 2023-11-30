package DemoLoop2;

import java.util.Arrays;

public class CharlieWhileLoop {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i<5 ; i++){
      sum  += i;
    }
    System.out.println("sum=" + sum);


    int j = 0;
    sum = 0; 
    while ( j <5 ){//while = 當既意思
      sum += j++; //

    }
    System.out.println("sum=" + sum + ", j=" + j );

    // continue, break
    //Print odd numbers and <= 5
    //1,3,5 (1-10)
     j=0;
     while ( ++j <= 10){
      if(j >5 )
      break;
      if (j % 2 == 0);
      continue;
     }
     System.out.println(j);
     

     int x = 10;
     int y = 5;
     while (x > 0 && y > 0){
      System.out.println("x=" + x + ", y=" + y);
      y--;
      x--;
     }


     //0 1 1 2 3 5 8 13 ...<1000  搵最接近1000 果個數
     int a2 = 0;
     int a1 = 1;
     int e = -1;
     int[] arr = new int [20];
     int idx = 0;
     arr[idx++] = a2;
     arr[idx++] = a1;
     while ( e < 1000){
      e = a1 + a2;
      a2 = a1;
      a1 = e;
      arr[idx++] = e;
     }
     System.out.println(Arrays.toString(arr));

     //Approach 2:
     a2 = 0;
     a1 = 1;


     





  }
}
