/**
 * Rational class by Breakout Room 9
 * Greg Sciame
 * collaborators: Mike Park, Kiana H, Marieke T
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    /* YOUR ELEGANT CODE HERE */
    this._numerator = 0;
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    if(d != 0){
      _denominator = d;
      _numerator = n;
  } else {
      _numerator = 0;
      _denominator = 1;
      System.out.println("Invalid denominator attempted... reverting to default value of 0/1");
  }

  }
  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */
    
    return(_numerator + "/" + _denominator);
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    if (_denominator == 0)
    {
      //this should never happen; can't produce denominator of zero by constructor OR division
      System.out.println("Error: divide by 0. Returning 0.0");
      return 0.0;
    } else
    {
      return (double) _numerator / _denominator;
    }
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    //multiply numerator by r's numerator and denominator by r's denominator
    this._numerator *= r._numerator;
    this._denominator *= r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    //if r's numerator is 0, then multiplying by the reciprocal will produce a denominator of 0
    if (r._numerator == 0){
      System.out.println("Error: divide by 0. Value is still " + this);
    }
    else {
      //multiply this fraction by reciprocal of r
      this._numerator *= r._denominator;
      this._denominator *= r._numerator;
    }
  }

}//end class