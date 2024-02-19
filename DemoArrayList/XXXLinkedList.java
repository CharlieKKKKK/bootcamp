package DemoArrayList;

import java.util.Objects;

public class XXXLinkedList {

  private Node head;

  public XXXLinkedList() {

  }

  public void add(int value) {
    if (this.head == null) {
      this.head = new Node(value);
      return;
    }
    // while loop until tail, then setNext()
    Node current = this.head;
    while (current.next() != null) {
      current = current.next();
    }
    current.setNext(new Node(value));
  }

  // remove(int value)
  public void remove(int value) {
    // Early Return
    if (this.head == null)
      return;
    if (this.head.getValue() == value) {
      this.head = this.head.next();
    }
    Node curNode = this.head;
    while (curNode != null) {
      if(curNode.getValue() == value){
        curNode.prev().setNext(curNode.next());
      }
      curNode = curNode.next();

    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("boot ");
    Node curNode = this.head;
    while (curNode != null) {
      sb.append(curNode.getValue());
      curNode = curNode.next();
    }
    return sb.append(" camp").toString();
  }

  public static void main(String[] args) {
    XXXLinkedList ll = new XXXLinkedList();
    System.out.println(ll.toString());
    ll.add(3);
    System.out.println(ll.toString());
    ll.add(100);
    System.out.println(ll.toString());
  }
}
