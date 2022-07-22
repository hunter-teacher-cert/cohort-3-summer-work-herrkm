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

    System.out.println("\nPrint the Linked List after adding \"six\" at index 0:");
    l.add(0, "six");
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
    System.out.println("\nPrint the Linked List after removing the item at index 3:");
    l.remove(3);
    System.out.println(l);

    System.out.println("\nPrint the Linked List after removing the item at index 7:");
    l.remove(7);
    System.out.println(l);

    System.out.println("\nPrint the Linked List after removing the item at index 0:");
    l.remove(0);
    System.out.println(l);

    System.out.println("\nPrint the Linked List after adding multiple copies of \"six\"");
    l.add("six");
    l.add(3, "six");
    l.add(3, "six");
    l.add(7, "six");
    System.out.println(l);

    System.out.println("\nPrint the array of indices containing the string \"six\"");
    int[] sixIndices = l.indicesOf("six");
    for (int element : sixIndices) System.out.print(element + " ");
    System.out.println();

    System.out.println("\nPrint the array of indices containing the string \"seven\"");
    int[] sevenIndices = l.indicesOf("seven");
    for (int element : sevenIndices) System.out.print(element + " ");
    System.out.println();
  }
}