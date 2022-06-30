/**
* Game of Nim by Team Breakout Room 5
* Kiana Herr
* collaborators: Adam Driggers, Shana Henry, Vanessa Zou, Patricia Wygard
*/

import java.io.*;
import java.util.*;



public class Nim //goal: be the player to remove the last stone
{
  public static void main( String[] args )  {
    int stones = 12; //define variable stones, 12 in bag to start
    int stonesTaken; //will need to keep track of how many are removed

    Scanner input = new Scanner(System.in);

    //loop until game ends
    System.out.println("Let's play Nim! This version you have 12 stones to begin and the last player to take a stone wins! You can remove between 1 and 3 stones.")
    while ( ) {
      //prompt user input (user turn)
      System.out.println("How many stones do you wish to remove?");
      stonesTaken = input.nextInt();
      input.nextLine();
      if (stonesTaken > 0 && stonesTaken < 4) {
        
      }
      //calculate and print number of stones remaining
      //check for win
      //machine turn
      //calculate and print number of stones remaining
      //check for win
    }



    
  }

  
}