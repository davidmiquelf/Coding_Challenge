package ca.jrvs.challenge.frequency4;

import ca.jrvs.challenge.frequency5.structures.Link;
import ca.jrvs.challenge.frequency5.structures.LinkedList;

public class ReverseLinkedList {

  public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list){
    LinkedList<T> newList = new LinkedList<>();

    Link<T> currentLink = list.getHead();
    newList.addAtHead(currentLink.getVal());
    while (currentLink.hasNext()){
      currentLink = currentLink.getNext();
      newList.addAtHead(currentLink.getVal());
    }
    return newList;
  }

}
