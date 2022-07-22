import java.io.*;
import java.util.*;

public class Methods {

  public static void main(String args[]){
    System.out.println(isDivisible(6,2));
    System.out.println(isTriangle(3, 8, 3));
    System.out.println(ack(2, 2));
  }

  /* exercise 2 */
  public static boolean isDivisible(int n, int m) {
    if (m == 0) {
      System.err.println("Cannot divide by zero");
      return false;
    } else {
      return n % m == 0;
    }
  }

  /* exercise 3 */
  public static boolean isTriangle(int a, int b, int c){
    if (a == Math.max(Math.max(a,b),c)){
      return b + c > a;
    } else if (b == Math.max(Math.max(a,b),c)){
      return a + c > b;
    } else {
      return a + b > c;
    }
  }

  /* exercise 8 */
  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    } else if (n == 0){
      return ack(m - 1, 1);
    } else {
      return ack(m - 1, ack(m, n-1));
    }
  }
}