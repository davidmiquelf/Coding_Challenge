package ca.jrvs.challenge;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList<T> {

  private Link<T> head;

  public LinkedList(T val){
    Link<T> link = new Link(val);
    this.setHead(link);
  }

  public LinkedList(Collection<T> collection){
    Iterator<T> iterator = collection.iterator();
    if (iterator.hasNext()){
      this.setHead(new Link(iterator.next()));
    }
    Link<T> currentLink = this.getHead();
    while (iterator.hasNext()){
      currentLink.setNext(new Link(iterator.next()));
      currentLink = currentLink.getNext();
    }
  }
  public T get(int index) {
    Link link = this.getLink(index);
    return (T) link.getVal();
  }

  public Link<T> getHead() {
    return head;
  }

  public void deleteAtIndex(int index){
    if (index == 0){
      this.setHead(this.getHead().getNext());
    }
    Link link = this.getLink(index);
  }


  public void addAtHead(T val) {
    Link newLink = new Link(val);
    newLink.setNext(this.getHead());
    this.setHead(newLink);
  }

  public void addAtTail(T val) {
    Link newLink = new Link(val);
    Link current = this.getHead();
    while (current.hasNext()) {
      current = current.getNext();
    }
    current.setNext(newLink);
  }

  public void addAtIndex(T val, int index) {
    Link newLink = new Link(val);
    if (index == 0){
      newLink.setNext(this.getHead());
    } else {
      Link link = getLink(index - 1);
      newLink.setNext(link.getNext());
      link.setNext(newLink);
    }
  }

  private Link getLink(int index){
    int idx = index;
    Link link = this.getHead();
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

  public void setHead(Link<T> head) {
    this.head = head;
  }

  public class Link<T> {
    private Link next = null;
    private T val;

    public Link(T val) {
      this.val = val;
    }


    public Link getNext() {
      return next;
    }

    public void setNext(Link next) {
      this.next = next;
    }

    public Boolean hasNext() {
      return this.next != null;
    }

    public T getVal() {
      return this.val;
    }

  }

}
