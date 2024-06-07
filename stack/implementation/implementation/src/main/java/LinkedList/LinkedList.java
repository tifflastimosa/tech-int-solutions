package LinkedList;

public class LinkedList<T> {

  private int size;
  private Node head;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  // add : add to the front of the linked list
  public void add(T value) {
    // 1. create the new node
    Node newNode = new Node(value);
    if (this.size == 0) {
      this.head = newNode;
    } else {
      newNode.setNext(this.head);
      this.head = newNode;
    }
    this.size++;
  }

  // delete : remove from the front of the linked list
  public Node delete() throws Exception {
    if (this.size == 0) {
      throw new Exception("Stack is empty");
    }
    Node temp = this.head;
    this.head = temp.getNext();
    temp.setNext(null);
    this.size--;
    return temp;
  }

  // size
  public int getSize() {
    return this.size;
  }

  // get the front of the linked list

  public Node getHead() {
    return this.head;
  }
}
