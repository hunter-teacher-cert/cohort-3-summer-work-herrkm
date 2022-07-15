import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  } 

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node newNode = new Node(value, head);
    //System.out.println(n1);
    head = newNode;
    //System.out.println(head);
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = head;
    for(int i = 0; i < index; i++){
      walker = walker.getNext();
    }
    return walker.getData();
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node walker = head;
    String listString = "";
    while (walker.getNext() != null){
      listString += walker.getData() + "->";
      walker = walker.getNext();
    }
    listString += walker.getData();
    return listString;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node walker = head;
    int count = 0;
    while (walker != null){
      count += 1;
      walker = walker.getNext();
    }
    return count;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
    if (index == 0){
      add(value);
    } else {
      Node walker = head;
      //walk through to get the node currently at the target index
      for (int i = 0; i < index; i++){
        walker = walker.getNext();
      } //ends for loop
      
      Node previous = head;
      //walk through to get the node currently before the target index
      for (int j = 0; j < index - 1; j++){
        previous = previous.getNext();
      } //ends for loop
      
    Node newNode = new Node(value, walker);
    previous.setNext(newNode);
    } //ends if/else

    
  } //ends add method


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}