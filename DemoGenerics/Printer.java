package DemoGenerics;

import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is a part of class defintion, and it can be bounded

  private List<T> values;// 點解改左Array 之後要+S
  // T 只會可以起Class上面出現

  public Printer() {
    this.values=new ArrayList<>();
  }

  public Printer(T value) {
    // add value into T array
    this.values = new ArrayList<>(List.of(value));
  }

  public List<T> getValue() {
    return this.values;
  }

  public double sum() {
    double sum = 0;
    for (T t : this.values) {
      sum += (double)t;
    }
    return sum;
  }
  public void add(T value){
    values.add(value);
  }
  

  public static void main(String[] args) {
    Printer<Integer> integerPrinter = new Printer<>(10);
    // Printer<String> stringPrinter = new Printer<>("ABC");
    Printer<Double> doublePrinter = new Printer<>(8.8);
    doublePrinter.add(8.8);
    System.out.println(doublePrinter);

  }
}
