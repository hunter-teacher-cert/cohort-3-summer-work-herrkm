import java.io.*;
import java.util.*;

public class Date {
  public static void main(String[] args){
    String day = "Sunday", month = "January";
    int date = 9, year = 2022;
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}