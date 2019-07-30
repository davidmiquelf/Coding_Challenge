package ca.jrvs.challenge.frequency4;

import static org.junit.Assert.*;

import ca.jrvs.challenge.frequency5.structures.LinkedList;
import org.junit.Test;

public class ReverseLinkedListTest {

  @Test
  public void reverseLinkedList() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addAtHead(1);
    list.addAtHead(2);
    list.addAtHead(3);
    list.addAtHead(4);
    LinkedList<Integer> reversed = ReverseLinkedList.reverseLinkedList(list);
    assertEquals(reversed.get(0), list.get(3));
  }
}