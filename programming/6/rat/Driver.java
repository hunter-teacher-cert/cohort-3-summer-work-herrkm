
/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {

    
      Rational r = new Rational( 3, 7 );
    
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );

      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );

      Rational x = new Rational( 8, 12 );

      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );

      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );
      
      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);
      
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

      System.out.print( r + " / " + s + " = ");
      r.divide(s);
      System.out.println(r);

      System.out.println("Is " + r + " equal to " + s + "?");
      System.out.println(r.equals(s));

      System.out.println("Is " + r + " equal to " + r + "?");
      System.out.println(r.equals(r));

      System.out.println("Compare " + r + " to " + s + ":");
      System.out.println(r.compareTo(s));

      System.out.println("Compare " + r + " to " + r + ":");
      System.out.println(r.compareTo(r));

      System.out.println("Compare " + s + " to " + r + ":");
      System.out.println(s.compareTo(r));
  }

}//end class