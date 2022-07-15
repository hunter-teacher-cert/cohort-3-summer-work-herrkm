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



  public static int maxOfList(int[] nums){
    //find max of items in array
    int maxVal = 0;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] > maxVal){
        maxVal = nums[i];
      } //ends the if statement
    } //ends the for loop
    return maxVal;
  } //ends maxOfList method


  public static void printArray(String[][] array){
    for (String[] row : array){
      for (String element : row){
        System.out.print(element + " ");
      }
      System.out.println();
    }
  } //ends printArray method

  
  public static void vBarGraphify(int[] nums){
    int maxValue = maxOfList(nums);
    
    String[][] stringArray = new String[maxValue + 1][nums.length];
    for (int j = 0; j < nums.length; j++){ //iterate through columns
      for (int k = 0; k <= maxValue; k++){ //iterate through rows
        //fills a column to height k from the bottom
        stringArray[maxValue - k][j] = (k <= nums[j]) ? "*" : " ";
      } //end row loop
      stringArray[maxValue][j] = String.valueOf(j);
    } //end loop to build stringArray[][]

    printArray(stringArray);
    
  } //ends vBarGraphify method
  
}