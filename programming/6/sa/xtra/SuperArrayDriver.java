import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);

    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    
    System.out.println("Testing constructor with size argument:");
    SuperArray sa2 = new SuperArray(20);
    System.out.println("Adding values:");
    sa2.add(10);
    sa2.add(299);
    sa2.add(42);
    
    System.out.println("Testing print of array:");
    System.out.println(sa2);

    System.out.println("Adding more than max values:");
    sa2.add(4);
    sa2.add(166);
    sa2.add(4);
    sa2.add(6);
    sa2.add(14);
    sa2.add(36);
    sa2.add(3);
    sa2.add(34);
    System.out.println(sa2);



    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------

    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println("Testing whether array is empty:");
    System.out.println(sa.isEmpty());
    
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);

    System.out.println("Get the value at index 5, 0, and 17:");
    System.out.println(sa.get(5));
    System.out.println(sa.get(0));
    System.out.println(sa.get(17));
    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);

    sa.remove(5);
    System.out.println(sa);

    sa.remove(15);
    System.out.println(sa);

    System.out.println("\nTesting replacement of item at index 2 with 10:");
    sa.replace(2, 10);
    System.out.println(sa);

    System.out.println("\nTest adding a value at an index outside or equal to the size of the array:");
    sa.add(30, 100);
    System.out.println(sa);
  }//main

}//class SuperArrayDriver