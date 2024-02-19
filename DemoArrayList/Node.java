package DemoArrayList;

public class Node {
  private int value;
  private Node prev;
  private Node next;

/*   private Node(int value, Node next, Node prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }*/

 public Node(int value) {
    this.value = value;
  }

  public Node prev() {
    return this.prev;
  }

  public Node next() {
    return this.next;
  }

  private void setPrev(Node node) {
    this.prev = node;
  }

  public void setNext(Node node) {
    this.next = node;
    node.setPrev(this);
  }

  public Node getNode() {
    return this.next;
  }

  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Node head = new Node(100);
    Node node1 = new Node(101);
    head.setNext(node1);
    node1.setNext(new Node(102));

    System.out.println(head.getNode().getNode().getValue());// 102

    System.out.println(head.next().next().prev().getValue());//101
    // node1 cannot find the
  }
}
