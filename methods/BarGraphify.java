import java.io.*;
import java.util.*;

public class BarGraphify{

  
  public static void main(String[] args){
    int[] x = {0,1,2,3};
    barGraphify(x);

    System.out.println();
    int[] y = {10, 11, 15};
    barGraphify(y);

    System.out.println();
    vBarGraphify(x);
    System.out.println();
    vBarGraphify(y);
    
  }


  public static void barGraphify(int[] nums){
    //go through each element of the array
    for(int i = 0; i < nums.length; i++){
      //print index and colon
      System.out.print(i + ": ");

      //print equals signs until there are the number specified in nums[i]
      for(int j = 0; j < nums[i]; j++){
        //System.out.print(j);
        System.out.print("=");
      } //ends print of this line of equals signs

      //prints newline
      System.out.println();
      
    } //ends for loop for array
  } //ends barGraphify


  //starter for vBarGraphify
  // public static void vBarGraphify(int[] nums){
  //   //find max of items in array
  //   int maxValue = 0;
  //   for (int i = 0; i < nums.length; i++){
  //     if (nums[i] > maxValue){
  //       maxValue = nums[i];
  //     }
  //   } //end for loop to find max
    
  //   String[][] stringArray = new String[maxValue + 1][nums.length];
  //   for (int j = 0; j < nums.length; j++){
  //     for (int k = 0; k < nums[j]; k++){
  //       //fills a column to height k from the bottom
  //       stringArray[maxValue - 1 - k][j] = "*";
  //     }
  //     stringArray[maxValue][j] = String.valueOf(j);
  //   } //end for loop to build stringArray[][]

  //   for (String[] row : stringArray){
  //     for (String element : row){
  //       System.out.print(element + " ");
  //     }
  //     System.out.println();
  //   }
  // }
}