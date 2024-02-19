package DemoStream;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  List<Address> addresses;

  public Customer() {
    addresses = new ArrayList<>();
  }

  public void addAddress(String AddressLine1, String AddressLine2) {
    addresses.add(new Address(AddressLine1, AddressLine2));
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public class Address {
    private String line1;
    private String line2;

    private Address(String line1, String line2) {
      this.line1 = line1;
      this.line2 = line2;
    }

    public void print() {
      System.out.println(addresses);
    }

    @Override
    public String toString() {
      return "Address(" //
          + "line1=" + this.line1 //
          + ", line2=" + this.line2 //
          + ")";
    }
  }
}
