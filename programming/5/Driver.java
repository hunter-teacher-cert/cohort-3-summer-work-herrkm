 import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Aasine Cassara
 * collaborators: Alana,Kiana, Jerusha
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

  public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	  Time t;

	//assign var the address of a newly-apportioned Time object
	  t = new Time();
    System.out.println(t.toString());
    Time t2 = new Time(3,13,30);
    System.out.println(t2.toString());

    t.set(2,22,33);
    System.out.println(t.toString());

    t.add(t2);
    System.out.println(t.toString());

    Time t3 = new Time(3, 13, 30);
    System.out.println("Does " + t3 + " equal " + t + "?");
    System.out.println(t3.equals(t));
    System.out.println("Does " + t3 + " equal " + t2 + "?");
    System.out.println(t3.equals(t2));

    System.out.println("Compare " + t3 + " to " + t + ":");
    System.out.println(t3.compareTo(t));
    
    System.out.println("Compare " + t3 + " to " + t2 + ":");
    System.out.println(t3.compareTo(t2));
    
    }//end main()

}//end class