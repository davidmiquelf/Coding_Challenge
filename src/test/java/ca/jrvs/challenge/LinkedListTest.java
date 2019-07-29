package ca.jrvs.challenge;

import static org.junit.Assert.assertEquals;

import ca.jrvs.challenge.frequency5.objects.LinkedList;
import org.junit.Test;

public class LinkedListTest {

  @Test
  public void get() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addAtHead(1);
    list.addAtHead(2);
    list.addAtHead(3);
    list.addAtHead(4);
    assertEquals(Integer.valueOf(1), list.get(3));
  }

  @Test
  public void deleteAtIndex() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addAtHead(1);
    list.addAtHead(2);
    list.addAtHead(3);
    list.addAtHead(4);
    list.deleteAtIndex(2);
    assertEquals(Integer.valueOf(1), list.get(2));
    list.deleteAtIndex(2);
    assertEquals(Integer.valueOf(3), list.get(1));
  }

  @Test
  public void addAtIndex() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addAtTail(1);
    list.addAtTail(2);
    list.addAtTail(4);
    list.addAtIndex(0,0);
    assertEquals(Integer.valueOf(0), list.get(0));
    list.addAtIndex(3, 3);
    assertEquals(Integer.valueOf(3), list.get(3));
    list.addAtIndex(5, 5);
    assertEquals(Integer.valueOf(5), list.get(5));
  }
}