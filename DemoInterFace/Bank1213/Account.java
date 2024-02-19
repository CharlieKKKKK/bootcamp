package DemoInterFace.Bank1213;

import java.util.Arrays;

public class Account implements Transferable{//[10]

  // private int balance;// [1] //[10.4]唔要balance,因為Credit可以做所有野

  private AccountHolder accountHolder;// [2]

  private Transaction[] transactions; // [4]

  // Create Account, accountHolder must be there.
  public Account(AccountHolder accountHolder) {// [2]
    // this.balance = 0; //[10.4]
    this.accountHolder = accountHolder;
    this.transactions = new Transaction[0];// [5]
  }

  public Account(String name, int age) {// [3]
    // this.balance = 0; //[10.4]
    this.accountHolder = new AccountHolder(name, age);
    this.transactions = new Transaction[0];// maybe[10.4]
  }

  private boolean addTransaction(Transaction transaction) {// [5] //[10.4] 改private & boolean
    Transaction[] newArr = Arrays.copyOf(this.transactions, this.transactions.length + 1);
    newArr[newArr.length - 1] = transaction;
    this.transactions = newArr;
    return true;
  }

  public int balance() {// [4]
    int sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      // isCredit true/ false [9]
      if (this.transactions[i].isCredit())// [9.2]
        sum += this.transactions[i].getAmount();
      else
        sum -= this.transactions[i].getAmount();// [9.3]
    }
    return sum;
  }

  public boolean credit(int amount) {// add [1] //[10.3]void改boolean
    // this.balance += amount;// 全改vvvv[10.5]vvv
    return this.addTransaction(Transaction.now(true, amount));// [10.5]

  }

  public boolean debit(int amount) {// deduct [1]
    if (this.balance() < amount)
      return false;
    // this.balance -= amount;[10.6]
    // return true;//[10.6]
    return this.addTransaction(Transaction.now(false, amount));// [10.6]
  }

  @Override // [??]
  public boolean transfer(Account to, int amount) {// [10.2]
    if (amount <= 0)
      return false;// throw
    if (this.balance() < amount) // [13.1]
      return false;// [13.1]
    if (!to.credit(amount))// [13.1]
      return false;// [13.1]
    return this.addTransaction(Transaction.now(false, amount));// [13.1]
    // if (!this.debit(amount)) //[13]
    // return false; //[13]
    // if (!to.credit(amount))// [10.3] >//[13]
    // return false; //[10.7]
    // this.addTransaction(Transaction.now(false, amount));// debit //[10.7]
    // return false;// [10.7] >//[13]
    // return true;// [10.7] >//[13]

    // if amount < 0
    // add transaction
    // debit -> fail?

    // credit account
    // add transaction

  }

  public static void main(String[] args) {
    Account johnAccount = new Account("john", 30);// maybe[3]
    // johnAccount.addTransaction(Transaction.now(true, 3000));// [11.1]
    // johnAccount.addTransaction(Transaction.now(true, 1500));// [11.1]
    // johnAccount.addTransaction(Transaction.now(false, 4000));// [11.1]
    johnAccount.credit(3000);// Includes Add Transaction [11.2] 改咁樣用
    johnAccount.credit(1500);// [11.2]
    johnAccount.debit(4000);// [11.2]
    System.out.println(johnAccount.balance()); //500

    Account peterAccount = new Account("peter", 25);// [11]
    johnAccount.transfer(peterAccount, 350);// [11]

    System.out.println(johnAccount.balance());// [11] >150
    System.out.println(peterAccount.balance());// [11] >350

    Transferable maryAccount = new Account("Mary",10);
    System.out.println(maryAccount.transfer(peterAccount, 200));// false [14]

    Account maryAccount2 = (Account) maryAccount;
  }
}
