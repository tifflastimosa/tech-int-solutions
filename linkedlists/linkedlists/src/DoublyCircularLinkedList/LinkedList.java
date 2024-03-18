package DoublyCircularLinkedList;

public class LinkedList {

  public Node head;
  public Node tail;
  public int size;

  // create circle double linked list

  public LinkedList(int value) {
    Node node = new Node(value);
    node.setPrev(node);
    node.setNext(node);
    this.head = node;
    this.tail = node;
    this.size = 1;
  }

  public LinkedList() {
    this.size = 0;
  }

  // private helper method adds to an empty linked list


  // add to the beginning of the linked list to make it an O(1) operation
  public void addBeginning(int value) {
    Node newNode = new Node(value, null, null);
    // if the linked list is empty
    if (this.head == null) {
      // set the new node pointers to itself because there is only one element in the list
      newNode.setNext(newNode);
      newNode.setPrev(newNode);
      this.head = newNode;
      this.tail = this.head;
    } else { // if the linked list is not empty
      newNode.setPrev(this.tail);
      this.tail.setNext(newNode);
      this.head.setPrev(newNode);
      newNode.setNext(this.head);
      this.head = newNode;
    }
    this.size++;
  }



//  public void displayAll() {
//    Node current = this.head;
//    if (this.size == 0) {
//      System.out.println("List is empty.");
//      return;
//    }
//    if (this.head.getNext() == this.head) {
//      System.out.print(this.head.getValue() + " <-> " + current.getValue() + "\n");
//      return;
//    }
//    System.out.print(this.head.getValue() + " <-> ");
//    current = this.head.getNext();
//    while (current.getNext() != this.head) {
//      System.out.print(current.getValue() + " <-> ");
//      current = current.getNext();
//    }
//    System.out.print(current.getValue() + " <-> ");
//    current = current.getNext();
//    System.out.println(current.getValue() + "\n");
//  }

}

