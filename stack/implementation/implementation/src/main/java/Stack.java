import LinkedList.LinkedList;
import LinkedList.Node;

public class Stack<T> {

  LinkedList stack;

  public Stack() {
    this.stack = new LinkedList();
  }

  // peek
  public Node peek() throws Exception {
    if (this.stack.getSize() == 0) {
      throw new Exception("Stack is empty!");
    }
    return this.stack.getHead();
  }

  // pop
  public Node pop() throws Exception {
    if (this.stack.getSize() == 0) {
      throw new Exception("Stack is empty!");
    }
    return this.stack.delete();
  }

  // push
  public void push(T value) {
    this.stack.add(value);
  }

  // is empty
  public boolean isEmpty() {
    return this.stack.getSize() == 0;
  }

}
