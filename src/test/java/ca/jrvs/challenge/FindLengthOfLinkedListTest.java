package ca.jrvs.challenge;

import ca.jrvs.challenge.frequency5.FindLengthOfLinkedList;
import ca.jrvs.challenge.frequency5.objects.LinkedList;
import org.junit.Test;

public class FindLengthOfLinkedListTest {

  @Test
  public void findLengthOfLinkedList() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addAtTail(0);
    list.addAtTail(0);
    list.addAtTail(0);
    list.addAtTail(0);
    list.addAtTail(0);
    FindLengthOfLinkedList.find(list);
  }
}