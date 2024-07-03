package TreeAdv;

public class BinarySearchTree <T extends Comparable<T>> {

  private Node<T> root;

  public BinarySearchTree() {}


  private void insertLoop(T value) {
    Node<T> newNode = new Node<>(value);

    if (this.root == null) {
      this.root = newNode;
    } else {



    }



  }

}
