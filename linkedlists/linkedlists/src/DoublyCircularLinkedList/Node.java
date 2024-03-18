package DoublyCircularLinkedList;

public class Node {

  private Object value;
  private Node prev;
  private Node next;

  public Node(Object value) {
    this.prev = null;
    this.next = null;
    this.value = value;
  }

  public Node(int value, Node prev, Node next) {
    this.value = value;
    this.prev = prev;
    this.next = next;
  }

//  public int getValue() {
//    return this.value;
//  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getPrev() {
    return this.prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return this.value.toString();
  }
}
