import java.io.*;
import java.util.*;
public class Time {
  public static void main(String[] args){
    
    int hour = 11, minute = 8, second = 40; //define current time
    final int secPerMin = 60;
    final int secPerHour = 3600; //define conversion factors
    final int secPerDay = 24*secPerHour; //24 hours in a day 
    
    int secondsSinceMidnight = hour*secPerHour + minute*secPerMin + second;
    System.out.println("Seconds since Midnight: " + secondsSinceMidnight);
    System.out.println("Seconds until Midnight: " + (secPerDay - secondsSinceMidnight));
    double dSecondsSinceMidnight = secondsSinceMidnight;
    System.out.println("Percent of the day passed: " + Math.round(dSecondsSinceMidnight / secPerDay * 100) + "%");
    hour = 11;
    minute = 17;
    second = 30;
    int timeNow = hour*secPerHour + minute*secPerMin + second;
    System.out.println("Time elapsed since start of assignment: " + (timeNow - secondsSinceMidnight) + " seconds");
  }
}