package exercise;

public class TryMethod2 {
  public static void main(String[] args) {
String QQ = "SDSAGDFGHADDFH";
char ABC = getLastChar (QQ);
System.out.println(ABC);
}

public static char  getLastChar(String s){
  if ( s.length() < 1){
    return ' ';
  } else {  char LastChar = s.charAt(s.length()-1);
    return LastChar ;
}
}
}