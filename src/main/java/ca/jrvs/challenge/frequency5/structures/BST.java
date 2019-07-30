package ca.jrvs.challenge.frequency5.structures;

/**
 * Really just a wrapper on BST<T> so that root can be remembered easily.
 *
 * @param <T> Must be comparable (ie. integers, floats... etc)
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class BST<T extends Comparable<T>> {

  private BST<T> left = null;
  private BST<T> right = null;
  private T val;

  public BST(T val) {
    this.val = val;
  }

  public boolean isEmpty() {
    return (this.val == null);
  }

  public BST<T> getRoot() {
    return this;
  }

  public int size() {
    int size = 1;
    if (this.hasLeft()) {
      size += this.getLeft().size();
    }
    if (this.hasRight()) {
      size += this.getRight().size();
    }
    return size;
  }

  public void insert(T val) {
    if (val.compareTo(this.getVal()) >= 0) {
      if (left == null) {
        left = new BST<T>(val);
      } else {
        left.insert(val);
      }
    } else {
      if (right == null) {
        right = new BST<T>(val);
      } else {
        right.insert(val);
      }
    }
  }

  public boolean hasLeft() {
    return (this.getLeft() != null);
  }

  public boolean hasRight() {
    return (this.getRight() != null);
  }

  public BST<T> getLeft() {
    return left;
  }

  public void setLeft(BST<T> left) {
    this.left = left;
  }

  public BST<T> getRight() {
    return right;
  }

  public void setRight(BST<T> right) {
    this.right = right;
  }

  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }
}
