package DemoClass.order;

import java.math.BigDecimal;

public class Item {
  private double price;
  private String desc;
  private int quantity;

  // All-args constructor
  public Item(double price, String desc, int quantity) {
    this.price = price;
    this.desc = desc;
    this.quantity = quantity;
  }

  /*
   * public double price() {
   * return this.price;
   * }
   * 
   * public String desc() {
   * return this.desc;
   * }
   * 
   * public int quantity() {
   * return this.quantity;
   * }
   */

  public Item(double price2, int i, String string) {
  }

  // getter,setter
  public double getPrice() {
    return this.price;
  }

  public String getDesc() {
    return this.desc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public double totalAmount() {
    return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue();
  }
}
