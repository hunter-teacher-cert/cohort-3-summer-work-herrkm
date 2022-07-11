/**
 * SuperArray by Team MarvelvsDC
 * Greg Sciame
 * collaborators: Merieke Thomas, Kiana Herr, Moo Joon Park
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    this.data = new int[size];

    //init instance vars
    this.numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    this.data = new int[10];
    //init instance vars
    this.numberElements = 0;

  }
  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  
  //Don't need this with toString completed
  /*
  public void print()
  {
    for (int i = 0; i < numberElements; i++)
      {
        System.out.print(data[i] + " ");
      }
    System.out.println();
  }
  **/

    
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if (numberElements == data.length)
    {
      this.grow();
    }


    // add item
    this.data[numberElements] = value;


    // increment numberElements
    this.numberElements += 1;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
   return(numberElements==0);
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    String stringArray = "";
    for (int i = 0; i < numberElements; i++)
      {
        stringArray = stringArray + " " + data[i];
      }
    return stringArray;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    for (int i = index; i < numberElements - 1; i++)
      //we don't actually want to access index i + 1 if the underlying size of the array is equal to numberElements
      {
        data[i] = data[i+1];
      }

    // subtract fom numElements;
    numberElements -= 1;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if (numberElements == data.length)
    {
      this.grow();
    }

    // shift elements toward the end of the array
    for (int i = numberElements; i >= Math.max(index, 1); i--) //if index is 0 we don't want to try to access index i-1; if index is anything else we do
      {
        data[i] = data[i-1];
      }

    // insert new element
    data[index] = value;

    // increment numElements
    numberElements += 1;
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    //arbitrarily chose 10 to increase by default size amount. adding one at a time seems wasteful
    int[] data2 = new int[data.length + 10];


    // copy over all the elements from the old array to the new one
    for (int i = 0; i < data.length; i++)
      {
        data2[i] = data[i];
      }
    
    // point data to the new array
    data = data2;

    // Q: How does this look when illustrated using encapsulation diagram?
    //A new empty array called data2 of length data.length + 10 is created. It gets filled up to data.length - 1 with the current values in data. The reference name "data" gets pointed to the contents of data2.
  }//end grow()

}//end class