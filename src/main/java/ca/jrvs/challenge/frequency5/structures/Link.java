package ca.jrvs.challenge.frequency5.structures;

public class Link<T> {
  private Link<T> next = null;
  private T val;

  public Link(T val) {
    this.val = val;
  }


  public Link<T> getNext() {
    return next;
  }

  public void setNext(Link<T> next) {
    this.next = next;
  }

  public Boolean hasNext() {
    return this.next != null;
  }

  public T getVal() {
    return this.val;
  }

}
