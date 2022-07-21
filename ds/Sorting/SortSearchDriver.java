import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {
  
  
  	// Uncomment these to test part 1
  	
  	SortSearch ss = new SortSearch(20);
  	System.out.println(ss);
  	
  		
  	// Uncomment these to test part 2
  
  	int i;
  	i = ss.findSmallestIndex(0);
    System.out.println("\nPrint results when started at 0:\nss[smallestIndex] = value : data");
  	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  
  	i = ss.findSmallestIndex(3);
    System.out.println("\nPrint results when started at 3:\nss[smallestIndex] = value : data");
  	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  	
  	// Uncomment these to test part 3
    System.out.println("\nPrint sorted array:");
  	System.out.println(ss);
  	ss.sort();
  	System.out.println(ss);
  
    System.out.println("\nLocation of value 8 in list via Linear Search:");
    // public int binarySearch(int value)
    int location = ss.linearSearch(8);
    System.out.println(location);

    System.out.println("\nLocation of value 9 in list via Linear Search:");
    System.out.println(ss.linearSearch(9));

    System.out.println("\nLocation of value -2 in list via Linear Search: (should return -1)");
    System.out.println(ss.linearSearch(-2));

    System.out.println("\nLocation of value 22 in list via Linear Search: (should return -1)");
    System.out.println(ss.linearSearch(22));

    System.out.println("\nLocation of value 8 in list via Binary Search:");
  	System.out.println(ss.binarySearch(8));
  
  	System.out.println("\nLocation of value 9 in list via Binary Search:");
    System.out.println(ss.binarySearch(9));

    System.out.println("\nLocation of value -2 in list via Binary Search: (should return -1)");
  	System.out.println(ss.binarySearch(-2));
  
  	System.out.println("\nLocation of value 22 in list via Binary Search: (should return -1)");
    System.out.println(ss.binarySearch(22));

    // public int binarySearchRecursive(int value, int lowIndex, int highIndex)
    System.out.println("\nLocation of value 8 in list via Recursive Binary Search:");
  	System.out.println(ss.binarySearchRecursive(8, 0, ss.getSize() - 1));
  
  	System.out.println("\nLocation of value 9 in list via Recursive Binary Search:");
    System.out.println(ss.binarySearchRecursive(9, 0, ss.getSize() - 1));

    System.out.println("\nLocation of value -2 in list via Recursive Binary Search: (should return -1)");
  	System.out.println(ss.binarySearchRecursive(-2, 0, ss.getSize() - 1));
  
  	System.out.println("\nLocation of value 22 in list via Recursive Binary Search: (should return -1)");
    System.out.println(ss.binarySearchRecursive(22, 0, ss.getSize() - 1));
  }
}