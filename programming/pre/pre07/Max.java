import java.io.*;
import java.util.*;

public class Max {
  public static void main(String args[]){
    int[] a = {3, -1, 4, -28, 2, 1};
    indexOfMax(a);
  }

  public static int indexOfMax(int[] x){
    int i = 0;
    int max = x[0];
    for (int j = 0; j < x.length; j++){
      if (x[j] > max){
        max = x[j];
        i = j;
      }
    }
    System.out.println("The maximum value of the array");
    Array.printArray(x);
    System.out.println("can be found at index " + i);
    return i;
  }
}

//It's impossible to write this method using an enhanced for loop because you need to reference the index.