package ca.jrvs.challenge;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class LinkedList<T> {

  private LinkedList next = null;
  private LinkedList[] head = {this};
  private T val;

  public LinkedList(T val) {
    this.val = val;
  }

  public LinkedList(T val, LinkedList[] head) {
    this.head = head;
    this.val = val;
  }

  protected LinkedList[] getHeadPtr() {
    return head;
  }

  protected void setHeadPtr(LinkedList[] ptr) {
    this.head = ptr;
  }

  protected void copyHeadPtr(LinkedList link) {
    this.setHeadPtr(link.getHeadPtr());
  }

  public LinkedList getHead() {
    return head[0];
  }

  protected void setHead(LinkedList head) {
    this.head[0] = head;
  }

  public LinkedList getNext() {
    return next;
  }

  public void setNext(LinkedList next) {
    next.copyHeadPtr(this);
    this.next = next;
  }

  public Boolean hasNext() {
    return this.next != null;
  }

  public T getVal() {
    return this.val;
  }



  public T get(int idx) {
    int index = idx;
    LinkedList link = this;
    if (idx < 0) {
      throw new IndexOutOfBoundsException();
    }
    while (index > 0){
      if (!link.hasNext()){
        throw new IndexOutOfBoundsException();
      }
      link = link.getNext();
      index--;
    }
    return (T) link.getVal();
  }


  public void addAtHead(T val) {
    LinkedList newLink = new LinkedList(val);
    newLink.setNext(this);
    newLink.setHead(newLink);
  }

  public void addAtTail(T val) {
    LinkedList newLink = new LinkedList(val);
    LinkedList current = this;
    while (current.hasNext()) {
      current = current.getNext();
    }
    current.setNext(newLink);
  }

  public void addAtIndex(T val, int index) {
    LinkedList newLink = new LinkedList(val);
    if (index == 0){
      newLink.setNext(this);
    } else {
      LinkedList link = getLink(index - 1);
    }


  }

  private LinkedList getLink(int index){
    int idx = index;
    LinkedList link = this;
    if (idx < 0) {
      throw new IndexOutOfBoundsException();
    }
    while (idx > 0){
      if (!link.hasNext()){
        if(idx == 1){
          return null;
        } else {
          throw new IndexOutOfBoundsException();
        }
      }
      link = link.getNext();
      idx--;
    }
    return link;
  }

}
