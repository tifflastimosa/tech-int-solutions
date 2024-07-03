package TreeSimple;

public class BinarySearchTree {

  private Node root;

  public BinarySearchTree() {
  }

  public Node insert(Node root, int value) {
    if (root == null) {
      return new Node(value);
    }

    if (value < root.getData()) {
      root.setLeft(insert(root.getLeft(), value));
    } else if (value > root.getData()) {
      root.setRight(insert(root.getRight(), value));
    }

    return root;
  }
}
