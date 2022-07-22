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
    //I have chosen to allow the user to add a value to whatever index they choose. I can imagine scenarios where this functionality may be useful, and while my first instinct was to say "they should have planned for the size array they needed," even allowing an index larger than numElements  should be permissible for max usability (consider Ed's example - another five kids get added to your class)
    //mostly I'm doing this as an exercise; I realize that it may not be the most broadly applicable, but I appreciate flexibility and the creativity it requires. This does also require the assumption that the user is doing this on purpose rather than making this choice by mistake.

    //if index is outside of the allowable indices OR the new addition kicks the size over the current size, then grow the array.
    if (index >= data.length)
    {
      //call the grow method with a size argument to fit the target index
      this.grow(index);
      this.debug();
    }
    
    //if the array is currently full (this won't ever be the case if the above is true)
    if (numberElements == data.length)
    {
      this.grow();
    }

    //the array is now large enough for whatever the need is
    //if the target index is outside the current meaningful data then numberElements will need to be increased to 1 more than this new outermost index (counts the end of the meaningful data, not the number of meaningful entries)
    if (index >= numberElements) 
    {
      //first ensure that any values in the hidden portion of the array are 0
      for (int i = numberElements; i < data.length; i++)
        {
          data[i] = 0;
        }
      //no need to shift elements - the index is outside the existing meaningful data
      data[index] = value;
      numberElements = index + 1;
    }
    else //(if index < numberElements)
    {
      // shift elements toward the end of the array
      for (int i = numberElements; i > index; i--)
        {
          data[i] = data[i-1];
        }

      // insert new element
      data[index] = value;

      // increment numElements
      numberElements += 1;
    }
    
    
  }

  public void replace(int index, int value) //replaces the value at a given index with a specified value
  {
    this.remove(index); //removes the old value
    this.add(index, value); //adds the new value
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


  //grow to a target index
  private void grow(int n)
  {
    int[] data3 = new int[n+1];

    //copy over all elements from old array to new array
    for (int i = 0; i < data.length; i++)
      {
        data3[i] = data[i];
      }

    //point data to the new array
    data = data3;
  }

}//end class