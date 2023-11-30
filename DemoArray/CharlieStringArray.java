package DemoArray;

public class CharlieStringArray {
  public static void main(String[] args) {
    // "abc" "ijk" "xyz"

    String[] strings = new String[] { "abc", "ijk", "xyz" };
    String[] string2 = new String[3];
    string2[0] = "abc";
    string2[1] = "ijk";
    string2[2] = "xyz!";

    // for loop
    // string[0] -> "abcijk"
    // string[1] -> "ijkxyz"
    // string[2] -> "xyz"

    for (int i = 0; i < strings.length; i++) {//0.1.2
      if (i < strings.length - 1) {
        strings[i] = strings[i].concat(strings[i + 1]);
      }else{
        strings[i] =strings[i].concat("!");
      }
      System.out.println(strings[i]);
    }

    for (int i = 0; i < strings.length; i++) {//0.1.2
      //continue
      if(i < strings2.length-1){
      strings2[i]= strings2[i].concat(strings2[i+1]);
      continue;
      }
      strings2[i]=












  }
}