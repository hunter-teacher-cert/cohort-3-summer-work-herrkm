import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //testing add and toString
    l.add("one");
    l.add("two");
    l.add("three");
    l.add("four");
    System.out.println("\nPrint the Linked List:");
    System.out.println(l);
    
    System.out.println("\nPrint data at index 1:");
    String dataAt1 = l.get(1);
    System.out.println(dataAt1);

    System.out.println("\nPrint the size of the list:");
    int listSize = l.size();
    System.out.println(listSize);

    //testing add at index
    System.out.println("\nPrint the Linked List after adding \"five\" at index 2:");
    l.add(2, "five");
    System.out.println(l);
    

  }
}