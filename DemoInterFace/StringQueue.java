package DemoInterFace;

public class StringQueue implements Addable, Pollable {
  private String[] queue;

  public StringQueue() {
    this.queue = new String[0];
  }

  @Override
  public void add(String s) {
    addTail(s);
  }

  private void addTail(String s) {

  }

  @Override
  public String poll() {
    return pollHead();
  }

  private String pollHead() {

    return this.queue[0];

  }

  public String peak() { // read the head, not poll
    return this.queue[0];
  }

  //isEmpty
  //clear

  public static void main(String[] args) {
    StringQueue sq = new StringQueue();
    sq.add("hello");
    sq.add("ABC");
//    System.out.println(sq.isEmpty()); // false
    System.out.println(sq.peak()); // "hello"
    System.out.println(sq.poll()); // "hello"
    System.out.println(sq.poll()); // "ABC"
    
//    System.out.println(sq.isEmpty()); // true
    System.out.println(sq.poll()); // null
    
  }
}