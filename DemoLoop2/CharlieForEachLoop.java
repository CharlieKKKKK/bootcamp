package DemoLoop2;

public class CharlieForEachLoop {
  public static void main(String[] args) {
    //1129
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers){
      System.out.println("i="+i);
    }
    for (int i = 0; i< integers.length; i++){
      System.out.println("i=" + integers[i]);
    }
    String str= "abc,def,ijk,xyz";
    String[] part = str.split(",");
/*     for (int i = 0 ; i < str.length(); i++ ){
      System.out.print(part[i]); 
    }*/
    for (String s : part ){
      System.out.println("part=" + s);
    }

    
  }
}
