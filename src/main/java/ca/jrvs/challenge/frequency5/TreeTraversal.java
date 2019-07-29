package ca.jrvs.challenge.frequency5;

import ca.jrvs.challenge.frequency5.objects.BST;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

  public static <T extends Comparable<T>> List<T> inOrder(BST<T> bst){
    List<T> list = new ArrayList<>();
    if (bst.hasLeft()) {
      list.addAll(inOrder(bst.getLeft()));
    }
    if (!bst.isEmpty()){
      list.add(bst.getVal());
    }
    if (bst.hasRight()) {
      list.addAll(inOrder(bst.getRight()));
    }
    return list;
  }

  public static <T extends Comparable<T>> List<T> preOrder(BST<T> bst){
    List<T> list = new ArrayList<>();
    if (!bst.isEmpty()){
      list.add(bst.getVal());
    }
    if (bst.hasLeft()) {
      list.addAll(preOrder(bst.getLeft()));
    }
    if (bst.hasRight()) {
      list.addAll(preOrder(bst.getRight()));
    }

    return list;
  }

  public static <T extends Comparable<T>> List<T> postOrder(BST<T> bst){
    List<T> list = new ArrayList<>();
    if (bst.hasLeft()) {
      list.addAll(postOrder(bst.getLeft()));
    }
    if (bst.hasRight()) {
      list.addAll(postOrder(bst.getRight()));
    }
    if (!bst.isEmpty()){
      list.add(bst.getVal());
    }
    return list;
  }

  /**
   * Accidentally thought I was supposed to implement this.
   */
  public static <T extends Comparable<T>> List<T> breadthFirstSearch(BST<T> bst){
    List<T> list = new ArrayList<>();
    List<BST<T>> row = new ArrayList<>();

    if (!bst.isEmpty()){
      list.add(bst.getVal());
    }
    row.add(bst);
    row = getNextRow(row);
    while (row.size() > 0){
      for (BST<T> node : row){
        if (!node.isEmpty()){
          list.add(node.getVal());
        }
      }
      row = getNextRow(row);
    }
    return list;
  }

  private static  <T extends Comparable<T>> List<BST<T>> getNextRow(List<BST<T>> row){
    List<BST<T>> newRow = new ArrayList<>();
    for (BST bst : row){
      if(bst.hasLeft()){
        newRow.add(bst.getLeft());
      }
      if(bst.hasRight()){
        newRow.add(bst.getRight());
      }
    }
    return newRow;
  }

}
