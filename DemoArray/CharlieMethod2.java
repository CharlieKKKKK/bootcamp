package DemoArray;

public class CharlieMethod2 {

//s1 -> "abc"
//s2 -> "def"
// return "abcdef"
public static String append(String s1, String s2){
  String result = s1 .concat(s2) ;// 用conact  比用+好
return result;
}
// Get the last charactor of the String s
//if s length < 1, return ' ' ( space character)
public static char  getLastChar(String s){
  if ( s.length() < 1){
    return ' ';
  } else {  char LastChar = s.charAt(s.length()-1);
    return LastChar ;
}
}

//s -> "helloworld"
//prefix -> "hello"
//return true
public static boolean isStartedWith(String s, String prefix){
  boolean result = s.indexOf(prefix) == 0;
  return result;
}


//s -> "abcbcdabc"
//toBeRemove -> "bcd"
//return "abcabc"
public static String remove(String s, String toBeRemove){     //左邊remove ,右邊replace
 String result = s.replace(toBeRemove, "");
 return result;

}  


}

