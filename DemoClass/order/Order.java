package DemoClass.order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {
  private int id;
  private LocalDate buyDate;
  // private double totalAmount;
  private Item[] items;
  private static int orderNo = 0;

  // public Order(int id, LocalDate date) {
  public Order(LocalDate date) {
    // this.id = id;
    this.id = ++orderNo;
    this.buyDate = date;
    this.items = new Item[0];
    // this.totalAmount = totalAmount;

  }

  public void addItem(Item item) {
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public int getId() {
    return this.id;
  }
  // public static double totalAmount(Item[] items){

  // }
  public double totalAmount() {
    // this.item;
    BigDecimal total = BigDecimal.valueOf(0);
    BigDecimal price = BigDecimal.valueOf(0);
    BigDecimal quantity = BigDecimal.valueOf(0);
    for (int i = 0; i < this.items.length; i++) {
      // price = BigDecimal.valueOf(this.items[i].getPrice());
      // quantity = BigDecimal.valueOf(this.items[i].getQuantity());
      total = total.add(BigDecimal.valueOf(this.items[i].totalAmount()));
    }
    return total.doubleValue();
  }

  // public void setTotalAmount(double amount) {
  // this.totalAmount = amount;
  // }

  @Override
  public String toString() {
    return "Order(id=" + this.id //
        + ", buyDate=" + this.buyDate //
        + ", totalAmount=" // + this.totalAmount //
        + ")";
  }

  public static void main(String[] args) {
    Order order = new Order(LocalDate.of(2000, 10, 1));
    order.addItem(new Item(10.0, 4, "ABC"));
    order.addItem(new Item(20.5, 4, "DEF"));

    Customer customer = new Customer();
    customer.addOrder(order);
    // Order order = new Order(1, LocalDate.of(2000, 10, 1), 2000);
    System.out.println(order.toString()); // Order(id=1, buyDate=2000-10-01, totalAmount=2000.0)
    System.out.println("total amount=" + order.totalAmount());
    System.out.println("total amount=" + customer.getOrder(1).totalAmount());
  }
}
