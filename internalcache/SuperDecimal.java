package internalcache;

import java.math.BigDecimal;

public class SuperDecimal extends BigDecimal {
  public SuperDecimal() {
    super("0.0");
  }

  public SuperDecimal(double value) {
    super(String.valueOf(value));
  }

  public static SuperDecimal valueOf(double value) {
    return new SuperDecimal(value);
  }

  @Override
  public final SuperDecimal multiply(BigDecimal value) {
    BigDecimal bd = this;
    BigDecimal bdValue = value;
    return (SuperDecimal) bd.multiply(bdValue);
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal();
    SuperDecimal sd2 = new SuperDecimal(3.0);
    SuperDecimal sd3 = new SuperDecimal(4.0);
    // 3.0 * 4.0
    // sd2 ,sd3 Inherit all BigDecimal public instance methods
    SuperDecimal sd4 = sd2.multiply(sd3);
    System.out.println(sd4.doubleValue());
  }

}
