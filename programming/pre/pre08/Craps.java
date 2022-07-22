import java.io.*;
import java.util.*;

public class Craps{
  
  public static void main(String args[]){
    for (String arg : args){
      int nRounds = Integer.parseInt(arg);
      for (int i = 1; i <= nRounds; i++){
        round();
        System.out.println();
      }
    }
  }
  
  public static int roll(int maxRoll){
    Random random = new Random();
    int rollValue = random.nextInt(maxRoll) + 1; //random number between 0 and maxRoll-1; add 1 to yield a value between 1 and maxRoll
    return rollValue;
  }

  public static int shoot(int nDice, int maxRoll){
    int totalRoll = 0;
    for (int i = 1; i <= nDice; i++){
      totalRoll = totalRoll + roll(maxRoll);
    }
    return totalRoll;
  }

  public static boolean round(){ //return true if win, false if lose
    int nDice = 2, maxRoll = 6;
    int roll = shoot(nDice, maxRoll);
    System.out.println("You rolled: " + roll);
    if (roll == 2 || roll == 3 || roll == 12){
      System.out.println("Craps! You lose.");
      return false;
    } else if (roll == 7 || roll == 11){
      System.out.println("Natural! You win!");
      return true;
    } else {
      int point = roll;
      System.out.println(roll + " is now your point value.");
      do {
        roll = shoot(nDice, maxRoll);
        System.out.println("You rolled: " + roll);
      } while (roll != point && roll != 7);
      if (roll == point){
        System.out.println("You rolled the point value, " + point + ". You win!");
        return true;
      } else {
        System.out.println("You rolled a 7. You lose.");
        return false;
      }
    }
  }
}