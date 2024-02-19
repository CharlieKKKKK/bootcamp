package DemoLambda.Charlie0102;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class CharlieOperator {
  public static void main(String[] args) {
    BinaryOperator<String> conactStrings = (s1, s2) -> s1.concat(s2);
    BiFunction<String, String, String> concatStrings2 = (s1, s2) -> s1.concat(s2);

    UnaryOperator<String> removeSpace = s -> s.replace(" ", "");
    System.out.println(removeSpace.apply("h  e l lo"));
  }
}
