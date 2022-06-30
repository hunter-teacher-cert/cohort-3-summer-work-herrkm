import java.io.*;
import java.util.*;

public class Lecture {
  public static void main (String[] args) {
    System.out.println(reverseString("Kiana"));
    System.out.println(allUpper("Kiana.Herr"));
    System.out.println(word2("The dog barks."));
  }
  

  //code to reverse a string
  public static String reverseString(String someString) {
    int i = someString.length() - 1;
    String reversedString = "";
    while (i >= 0) {
      reversedString = reversedString + someString.charAt(i);
      i--;
    }
    return reversedString;
  }

  //code to convert a string so all lower case (ASCII 97-122) becomes upper case (ASCII 65-90)
  public static String allUpper(String someString) {
    String allUpper = "";
    for (int i = 0; i < someString.length(); i++) {
      int currentCode = (int) someString.charAt(i);
      int newCode = (currentCode >=97 && currentCode <= 122) ? currentCode - 32 : currentCode;
      allUpper = allUpper + (char) newCode;
      }
    return allUpper;
  }

  //code to print the 2nd word of a sentence, assuming it does not begin with spaces and all words are separated only by spaces, and the sentence will have at least 3 words
  public static String word2(String someString) {
    String word2 = "";
    int space1 = -1;
    int space2 = -1;
    int spacesFound = 0;
    int i = 0;
    while (spacesFound < 2 && i < someString.length()){
      if (someString.charAt(i) == ' '){
        if (spacesFound == 0){
          space1 = i;
        }
        if (spacesFound == 1){
          space2 = i;
        }
        spacesFound++;
      }
      i++;
    }
    for (int j = space1 + 1; j < space2; j++){
      word2 = word2 + someString.charAt(j);
    }
    return word2;
  }
}