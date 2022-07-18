import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //testing add and toString
    System.out.println("\nPrint the size of the list:");
    System.out.println(l.size());
    
    l.add("one");
    l.add("two");
    l.add("three");
    l.add("four");
    System.out.println("\nPrint the Linked List:");
    System.out.println(l);
    
    System.out.println("\nPrint data at index 1:");
    String dataAt1 = l.get(1);
    System.out.println(dataAt1);
    System.out.println("\nPrint data at index 7:");
    String dataAt7 = l.get(7);
    System.out.println(dataAt7);

    System.out.println("\nPrint the size of the list:");
    System.out.println(l.size());

    //testing add at index
    System.out.println("\nPrint the Linked List after adding \"five\" at index 2:");
    l.add(2, "five");
    System.out.println(l);

    System.out.println("\nPrint the Linked List after adding \"six\" at index 7:");
    l.add(7, "six");
    System.out.println(l);

    System.out.println("\nPrint the Linked List after adding \"six\" at index 5:");
    l.add(5, "six");
    System.out.println(l);

    //testing indexOf
    System.out.println("\nPrint the index of the value \"three\":");
    System.out.println(l.indexOf("three"));

    System.out.println("\nPrint the index of the value \"seven\":");
    System.out.println(l.indexOf("seven"));

    //testing toArray
    System.out.println("\nPrint the Linked List in array form:");
    for (String element : l.toArray()){
      System.out.print(element + " ");
    }
    System.out.println();

    //testing remove
    System.out.println("\nPrint the Linked List after removing the item at index 2:");
    l.remove(2);
    System.out.println(l);

    System.out.println("\nPrint the Linked List after removing the item at index 7:");
    l.remove(7);
    System.out.println(l);
  }
}