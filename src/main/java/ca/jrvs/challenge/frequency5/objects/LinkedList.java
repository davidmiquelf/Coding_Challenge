package ca.jrvs.challenge.frequency5.objects;

import ca.jrvs.challenge.frequency5.objects.Link;
import java.util.Collection;
import java.util.Iterator;

/**
 * Linked list implementation. Generic.
 * @param <T> type of linked list values.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class LinkedList<T> {

  private Link<T> head;

  public LinkedList(){
    this.setHead(null);
  }

  public LinkedList(T val){
    Link<T> link = new Link<>(val);
    this.setHead(link);
  }
  public LinkedList(Collection<T> collection){
    Iterator<T> iterator = collection.iterator();
    if (iterator.hasNext()){
      this.setHead(new Link<>(iterator.next()));
    }
    Link<T> currentLink = this.getHead();
    while (iterator.hasNext()){
      currentLink.setNext(new Link<>(iterator.next()));
      currentLink = currentLink.getNext();
    }
  }

  public Link<T> getHead() {
    return head;
  }

  public void setHead(Link<T> head) {
    this.head = head;
  }

  public T get(int index) {
    Link<T> link = this.getLink(index);
    if (link != null){
      return link.getVal();
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  public void deleteAtIndex(int index){
    if (index == 0){
      this.setHead(this.getHead().getNext());
    }
    Link<T> link = this.getLink(index - 1 );
    if ( !link.hasNext() ){
      throw new IndexOutOfBoundsException();
    } else if (link.getNext().getNext() == null){
      link.setNext(null);
    } else {
      link.setNext(link.getNext().getNext());
    }

  }

  public void addAtHead(T val) {
    Link<T> newLink = new Link<>(val);
    newLink.setNext(this.getHead());
    this.setHead(newLink);
  }

  public void addAtTail(T val) {
    Link<T> newLink = new Link<>(val);
    Link<T> current = this.getHead();
    if (current == null){
      this.setHead(newLink);
      return;
    }
    while (current.hasNext()) {
      current = current.getNext();
    }
    current.setNext(newLink);
  }

  public void addAtIndex(T val, int index) {
    Link<T> newLink = new Link<>(val);
    if (index == 0){
      newLink.setNext(this.getHead());
      this.setHead(newLink);
    } else {
      Link<T> link = getLink(index - 1);
      if (link != null){
        if (link.hasNext()){
          newLink.setNext(link.getNext());
        }
        link.setNext(newLink);
      }
    }
  }

  private Link<T> getLink(int index){
    int idx = index;
    Link<T> link = this.getHead();
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
