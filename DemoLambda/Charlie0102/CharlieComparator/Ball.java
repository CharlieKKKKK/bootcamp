package DemoLambda.Charlie0102.CharlieComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {
  private double price;
  private Color color;

  public Ball(double price, Color color) {
    this.price = price;
    this.color = color;
  }

  public double getPrice() {
    return this.price;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public String toString() {
    return "Ball("//
        + "price = " + this.price//
        + "    color = " + this.color.name()//
        + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>(//
        List.of(new Ball(99.8, Color.RED), //
            new Ball(55.8, Color.GREEN), //
            new Ball(23.2, Color.GREEN), //
            new Ball(1.9, Color.YELLOW)));

    // Approach 1:
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);

    Collections.sort(balls, new SortByPrice());
    System.out.println(balls);

    // Approach 2:
    Comparator<Ball> sortByColor = (b1, b2) -> {
      return b2.getColor().name().compareTo(b1.getColor().name());
    };

    Comparator<Ball> sortByPrice = (b1, b2) -> {
      return b2.getPrice() > b1.getPrice() ? 1 : -1;
    };

    Comparator<Ball> sortByColorAndThenPrice = sortByColor.thenComparing(sortByPrice);

    Collections.sort(balls, sortByColorAndThenPrice);
    System.out.println(balls);

  }
}
