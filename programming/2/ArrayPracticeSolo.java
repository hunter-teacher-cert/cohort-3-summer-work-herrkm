/**
 * ArrayPractice by Team BossCoders
 * Kiana Herr
 * collaborators: Théa Williams, Patti Elfers-Wygand, Yeidy Levels
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPracticeSolo
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    data[0] = startValue;
    for (int i = 1; i < size; i++)
    {
      data[i] = data[i-1] + step;
    }

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    for (int i = 0; i < size; i++)
    {
      data[i] = r.nextInt(maxValue);
    }
    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
  */
  public static void printArray( int[] data )
  {
    for (int i = 0; i < data.length; i++)
      {
        System.out.print(data[i] + " ");
      }
    System.out.println();
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {
    for (int i = 0; i < data.length; i++)
      {
        if (data[i] == value) 
        {
          return i;
        }
      }
    return data.length;

  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    int total = 0;
    for (int i = 0; i < data.length; i++)
      {
        total += data[i];
      }

    return total; 
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    for (int i=1; i < data.length - 1; i++)
      {
        if (data[i] > data[i + 1])
        {
          return false;
        }
      }

    return true;

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int maxValue = data[0];  // will hold the maximum value;

    for (int i = 1; i < data.length; i++)
      {
        if (data[i] > maxValue)
        {
          maxValue = data[i];
        }
      }

    return maxValue;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    for (int i = 0; i < data.length; i++)
    {
      if (data[i] % 2 == 1)
      {
        count += 1;
      }
    }
    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    int x = 0; //hold value for reversal of corresponding indices
    for (int i = 0; i < data.length / 2; i++) //if length is odd it will leave the middle value alone due to integer division
    {
      x = data[i]; //store data at i
      data[i] = data[data.length - 1 - i]; //make data at i the value from data the same distance from the end of the array
      data[data.length - 1 - i] = x; //place stored value from i into its corresponding position
    }
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    System.out.print("Random array: ");
    printArray(data);
    int[] data2 = buildIncreasingArray(10,5,3);
    System.out.print("Increasing array: ");
    printArray(data2);

    System.out.println("Index of first occurence of 12 in the random array: " + firstOccurence(data, 12));
    System.out.println("Sum of elements in the random array: " + arraySum(data));
    System.out.println("Random array is sorted: " + isSorted(data));
    System.out.println("Sorted array is sorted: " + isSorted(data2));
    System.out.println("Max value of random array is at index: " + findMaxValue(data));
    System.out.println("There are " + countOdds(data) + " odd numbers in the random array.");
    flip(data);
    System.out.print("Newly reversed random array: ");
    printArray(data);

    // add calls to show that the methods you write work.
  }
}
