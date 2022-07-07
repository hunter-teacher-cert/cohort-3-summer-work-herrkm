/**
   DEMO
   animation in the terminal
   USAGE:
   Make this file your own, and comment liberally as you explore...
   Then use as basis for animating whatever you like. (Make a copy, rename, copy/paste, etc)
   WORKFLOW:
   Read for understanding.
   Skim over delay(). Focus on animate() and main().
   Jot down / discuss predictions of what you will see when you run it.
   Run.
   Reconcile expectation with observation.
*/

import java.io.*;
import java.util.*;

public class Animate
{
  static String CLEAR_SCREEN =  "\033[2J";
  static String TO_TOP_OF_SCREEN = "\033[1;1H";
  static String HIDE_CURSOR = "\033[?25l";

  // pause for n milliseconds
  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }


  // "repaint" by using an ANSI control character to
  // repeatedly place the cursor at the origin (upper left)
  public static void animate(int n)
  {
    //clear screen, place cursor at origin (upper left)
    System.out.print("[0;0H\n");

    //System.out.println("we are aaanimaniacs " + n); //prints "we are aaanimaniacs " followed by the integer input value

    // After you have predicted/observed/reconciled
    // behavior of the preceding line,
    // comment it out,
    // uncomment the for loop below, and
    // re-apply your process.

    
    for( int i=n; i > 0; i-- ) {
      System.out.println("we are aaanimaniacs " + i);
    } //prints a countdown "we are aaanimaniacs " followed by value starting at n and counting down
    

    delay(1000);
  }


  // run 20 frames of animation
  public static void main( String[] args )
  {
    for (int frame = 0; frame < 20; frame++) {
      animate(frame);
    }

  }//end main()

}//end class