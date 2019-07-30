package ca.jrvs.challenge.frequency4;

import ca.jrvs.challenge.frequency5.structures.Link;
import ca.jrvs.challenge.frequency5.structures.LinkedList;
public class removeNthNodeFromEndOfList {

  public static void removeNthFromEnd(LinkedList list, int n) {
    Link current = list.getHead();
    Link backTrack = list.getHead();
    //Point current n links ahead of backtrack.
    while (n > 0){
      n--;
      if (current != null){
        current = current.getNext();
      } else {
        throw new IllegalArgumentException();
      }
    }
    //Check if n is the length of the list.
    if (current == null){
      list.setHead(list.getHead().getNext());
    }
    //Move both pointers forward until current reaches the end.
    while (current.hasNext()){
      backTrack = backTrack.getNext();
      current = current.getNext();
    }
    //Get rid of the link in front of backtrack.
    backTrack.setNext(backTrack.getNext().getNext());
  }

}
