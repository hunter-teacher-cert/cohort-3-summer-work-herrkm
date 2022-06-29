import java.io.*;
import java.util.*;
public class Celsius {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double tempC;
    System.out.println("Enter a temperature in degrees Celsius:");
    tempC = in.nextDouble();
    input.nextLine(); //always a good idea, necessary when multiple inputs
    double tempF = tempC*9/5 + 32; //convert to Fahrenheit
    System.out.printf("%.1f C = %.1f F\n", tempC, tempF);
  }
}