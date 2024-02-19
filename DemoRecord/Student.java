package DemoRecord;

//Kind of Class
public record Student(String name, int age) {//final attribute

  public static int test = 1;

  public void read(){
    System.out.println("i am reading...");
  }
  // All attributes in ""
  // public void setName(String name){

  // }
}
