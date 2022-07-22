import java.io.*;
import java.util.*;

public class Guess {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + (Math.abs(number-guess)));
    }
}