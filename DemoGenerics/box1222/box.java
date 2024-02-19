package DemoGenerics.box1222;

public class Box<T> {
  T t;

  public T getT() {
    return this.t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static <T> Box<T> createBox(T t) {
    Box<T> box = new Box<>();
    box.setT(t);
    return box;
  }

  public static double calculate(Box<Shap> box){
    return box.getT().area();
  }
  public static void aadShape(L)
  public static void main(String[] args) {
    Box<Circle> circleBox = new Box<>();
    circleBox.setT(new Circle(3.0));
    //calculate(circleBox); 
    // error, Box<Circle><->Box<Shape> is not Parent relationship
    //Circle <-> Shape is Parent relationship
  }
}
