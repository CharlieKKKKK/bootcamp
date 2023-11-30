package DemoArray;

import java.util.Arrays;

public class CharlieSorting {
  public static void main(String[] args) {
    int[] arr = new int [] {1000,4,1050,500,-20};

    //1.Bubble sort  11/28  放最後
    int temp;
    for (int i =0; i < arr.length -1; i++){ 
      for(int j = 0 ; j < arr. length-1-i; j++){ // i 係估到行幾次，之後提早stop
        if (arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));



    // 2. Insertion sort  11/28
    int j;
    int key;
    int [] arr2 =new int [] { 100, -30, 40, 22, 44};
    for (int i = 1; i < arr2.length ; i++){// start from the 2nd element
      key = arr2[i]; //current element
      j = i -1 ;
      while (j >= 0 && arr[j] > key){
        arr2[j+1] = arr[j];
        j--;
      }
      arr2[++j] = key;
    }
System.out.println(Arrays.toString(arr2));

  }
}
