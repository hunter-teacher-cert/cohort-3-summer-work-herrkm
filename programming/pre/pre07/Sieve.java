import java.io.*;
import java.util.*;

public class Sieve {
  public static void main(String args[]){
    sieve(18);
    sieve(55);
    sieve(7);
  }

  public static boolean[] sieve(int n){
    int[] numberList = new int[n + 1];
    for (int i = 0; i <= n; i++){
      numberList[i] = i;
    }
    boolean[] primes = new boolean[n + 1];
    for (int i = 0; i < primes.length; i++){
      if (i < 2){
        primes[i] = false;
      } else {
        primes[i] = true;
      }
    } //fill a boolean array with truth values for 0-n, marking 0 and 1 as false

    int maxValue = (int) Math.floor(Math.sqrt(n)); //max composite-generating value is sqrt(n) truncated

    for (int i = 0; i < maxValue+1; i++){
      if (primes[i] == true){
        int comp = numberList[i]*numberList[i];
        while (comp <= n){
          primes[comp] = false;
          comp = comp + numberList[i];
        }
      }
    }
    System.out.println("The prime numbers up to " + n + " are:");
    for (int i = 0; i < numberList.length; i++){
      if (primes[i] == true){
        System.out.print(i + "  ");
      }
    }
    System.out.println();
    System.out.println();
    return primes;
  }
}