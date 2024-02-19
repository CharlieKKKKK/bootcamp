package DemoEnum;

public class Order {
  private int id;
  private Status status;

  public Order(int id, Status status) {
    this.id = id;
    this.status = status;
  }

  public Status getStatus() {
    return this.status;
  }

  public static void main(String[] args) {
    Order o1 = new Order(1, Status.ORDERD);
    Order o2 = new Order(1, Status.SHIPPED);
    Order o3 = new Order(2, Status.SHIPPED);

    if (o1.getStatus() != o2.getStatus()) {
      System.out.println("different status");
    }
    if (o1.getStatus().getVal() != o2.getStatus().getVal()) {
      System.out.println("different status value");
    }
    if (o2.getStatus() == o3.getStatus()) {
      System.out.println("same status ");
    }
    if (o2.getStatus().getVal() == o3.getStatus().getVal()) {
      System.out.println("same status value");
    }
  }
}
