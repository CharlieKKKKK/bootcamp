package DemoInterFace;

public interface Vehicle {// "Vehicle" is an abstract word

  // interface has NO instance variable
  int x = 10; // implicitly "public static final"

  // interface is a contract with 100% abstract behaviors (abstract methods)

  // if a class implements an interface, it has to implement all its abstract
  // methods (all or nothing)

  /* public abstract ---> 因為100%係abstract ，所以唔洗打"public abstract" */
  boolean start(); // imlicitly "public abstract" method

  boolean stop();

  boolean accelerate();

  boolean brake();

  public static void main(String[] args) {
    // x ->static?
    System.out.println(Vehicle.x);
  }
}
