package DemoInterFace.Bank1213;

import java.time.LocalDateTime;

public class Transaction {// Entry
  // String description;
  // String from;
  private LocalDateTime dateTime;
  private boolean isCredit;// enum
  private int amount;

  public int getAmount() {// [4]
    return this.amount;
  }

  private Transaction(LocalDateTime dateTime, boolean isCredit, int amount) {// [6]
    this.dateTime = dateTime;
    this.isCredit = isCredit;
    this.amount = amount;
  }

  public Transaction(boolean isCredit, int amount) {// [7]
    this(LocalDateTime.now(), isCredit, amount);
  }

  public static Transaction now(boolean isCredit, int amount) {// [8]
    return new Transaction(isCredit, amount);
  }

  public boolean isCredit() {// [9.1]
    return this.isCredit;

  }

  // 1214下午
  @Override
  public String toString() {
    return "Transaction(" + "datetime=" + this.dateTime + ", isCredit=" + this.isCredit + ", amount=" + this.amount
        + ")";

  }
}
