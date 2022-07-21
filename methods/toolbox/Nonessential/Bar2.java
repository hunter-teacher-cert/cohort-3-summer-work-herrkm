import java.io.*;
import java.util.*;

public class Bar2{

  
  public static void main(String[] args){
    int[] x = {0,1,2,3};
    System.out.println(barGraphify(x));

    System.out.println();
    int[] y = {10, 11, 15};
    System.out.println(barGraphify(y));
    
  }


  public static String barGraphify(int[] nums){
   String graphString = "";
    for(int i = 0; i < nums.length; i++){
      graphString = graphString + i + ":";
      //print equals signs until there are the number specified in nums[i]
      for(int j = 0; j < nums[i]; j++){
        //System.out.print(j);
        graphString = graphString + "=";
      } //ends print of this line of equals signs
      graphString = graphString + "\n";
      //prints newline
      
    } //ends for loop for array
    return graphString;
  } //ends barGraphify

}