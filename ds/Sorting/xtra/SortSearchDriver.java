import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {
    SortSearch ss = new SortSearch(20);
    // System.out.println(ss);
    int searchValue = ss.get(5);
    ss.sort();
    //System.out.println(data);
    ss.binarySearchAnimated(searchValue);
    // System.out.println(ss);
    // System.out.println("The value " + ss.get(5) + " can be found at index " + ss.binarySearch(ss.get(5)));
  

  }
}