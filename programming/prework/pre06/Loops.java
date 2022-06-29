import java.io.*;
import java.util.*;

public class Loops {

  public static void main(String args[]){
    squareRoot(2);
    power(2, 6);
    factorial(5);
  }

  /* exercise 2 */
  public static double squareRoot(double a){
    double x0 = a/2; //set initial case
    double x1 = (x0 + a/x0)/2; //set first estimate using formula
    while (Math.abs(x0 - x1) >= 0.0001) { //check if consecutive estimates are close enough
      x0 = x1; //set x0 to previous guess
      x1 = (x0 + a/x0)/2; //set x1 to new guess
    }
    System.out.println("The square root of " + a + " is approximately " + x1);
    return x1;
  }

  /* exercise 3 */
  public static double power(double x, int n){
    double value = 1;
    for (int i = 1; i <= n; i++){
      value = value*x;
    }
    System.out.println(x + " to the power of " + n + " is equal to " + value);
    return value;
  }

  /* exercise 4 */
    public static int factorial(int n){
    int value = n;
    for (int i = n-1; i >= 1; i--){
      value = value*i;
    }
    System.out.println(n + "! is equal to " + value);
    return value;
  }
}