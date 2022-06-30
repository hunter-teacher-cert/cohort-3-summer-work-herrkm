import java.io.*;
import java.util.*;

public class Array {
  public static void main(String args[]){
    double[] a = {1, 2, 3, 4, 5, 6};
    double[] b;
    b = powArray(a, 3);
    int[] x = {1, 2, 3, 4, 5, 0, 3, 2, 5, 1, 1};
    int[] counts = histogram(x, 6);
  }

  public static double[] powArray(double a[], int n){
    double b[] = new double[a.length];
    for(int i = 0; i < a.length; i++){
      b[i] = Math.pow(a[i], n);
    }
    System.out.println("Original array: ");
    printArray(a);
    System.out.println("Raised to the power of " + n + ":");
    printArray(b);
    return b;
  }

  public static int[] histogram(int scores[], int n){
    int[] counts = new int[n];
    System.out.println("Scores:");
    printArray(scores);
    for(int score : scores){
      counts[score]++;
    }
    System.out.println("Histogram of scores from 0 to " + (n-1) + ":");
    printArray(counts);
    return counts;
  }



  public static void printArray(double x[]){
    System.out.print("{  ");
    for(double x1 : x){
      System.out.print(x1 + "  ");
    }
    System.out.println("}");
  }
}