package ca.jrvs.challenge.frequency5;

import ca.jrvs.challenge.frequency5.objects.Link;
import ca.jrvs.challenge.frequency5.objects.LinkedList;

public class FindLengthOfLinkedList {

  /**
   * Find the length of a singly linked list.
   */
  public static int find(LinkedList list){
    int length = 0;
    Link link = list.getHead();
    if (link == null){
      return length;
    }
    while (link.hasNext()){
      length++;
      link = link.getNext();
    }
    return length;
  }
}
