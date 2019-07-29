package ca.jrvs.challenge.frequency4;

import ca.jrvs.challenge.frequency5.objects.Link;
import ca.jrvs.challenge.frequency5.objects.LinkedList;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfLinkedList {

  public Link middleNode(LinkedList list) {
    Link slow = list.getHead();
    Link fast = list.getHead();
    if (!slow.hasNext()) {
      return slow;
    }
    slow = slow.getNext();
    fast = slow.getNext();
    while (fast != null && fast.hasNext()){
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    return slow;
  }
}
