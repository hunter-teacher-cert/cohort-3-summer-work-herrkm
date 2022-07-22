/*
  Blink

  Starter code turns an LED on for one second, then off for one second, repeatedly.
  Construct a circuit with an LED and 220-ohm resistor hooked up to pin 13 of your Arduino.
  Upload the starter code and verify that it blinks the LED on and off.
  Then complete the challenges.
  
*/

// the setup function runs once when you press reset or power the board
void setup() {
  // initialize digital pin 13 as an output.
  pinMode(13, OUTPUT);
  //Add a line of code to initialize the second LED
  
}

// the loop function runs over and over again forever
void loop() {
  digitalWrite(13, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(13, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);                       // wait for a second

  //1) Write code to blink the light on and off for 2 seconds
  digitalWrite(13, HIGH);
  delay(2000);
  digitalWrite(13, LOW);
  delay(2000);

  //2) Add a second LED onto your breadboard. Modify your code so that both LEDs blink on and off simultaneously
  digitalWrite(13, HIGH);
  digitalWrite(12, HIGH);
  delay(2000);
  digitalWrite(13, LOW);
  digitalWrite(12, LOW);
  delay(2000);
  

  //3) Make the second LED blink opposite the first LED (when the first goes on, the second one goes off).

  digitalWrite(13, HIGH);
  digitalWrite(12, LOW);
  delay(2000);
  digitalWrite(13, LOW);
  digitalWrite(12, HIGH);
  delay(2000);

  //4) Make the first LED blink twice fast, and then make the second LED blink twice slowly.

  digitalWrite(13, HIGH);
  delay(1000);
  digitalWrite(13, LOW);
  delay(1000);
  digitalWrite(13, HIGH);
  delay(1000);
  digitalWrite(13, LOW);
  delay(1000);
  digitalWrite(12, HIGH);
  delay(2000);
  digitalWrite(12, LOW);
  delay(2000);
  //5) CHALLENGE: Choose one of the challenges below:
  //5a) CHALLENGE! Code a light show that matches a 10-sec snippet of music (song used: ______)
  
  //5b) CHALLENGE! Instead of having the arduino just blink on and off, program it to gradually fade up and down
  
  //5c) CHALLEGE! Code your own pattern!
  digitalWrite(13, HIGH);
  delay(2000);
  digitalWrite(12, HIGH);
  delay(2000);
  digitalWrite(13, LOW);
  delay(2000);
  digitalWrite(12, LOW);
  delay(2000);
  
  digitalWrite(13, HIGH);
  delay(1000);
  digitalWrite(12, HIGH);
  delay(1000);
  digitalWrite(13, LOW);
  delay(1000);
  digitalWrite(12, LOW);
  delay(1000);
  
  digitalWrite(13, HIGH);
  delay(500);
  digitalWrite(12, HIGH);
  delay(500);
  digitalWrite(13, LOW);
  delay(500);
  digitalWrite(12, LOW);
  delay(500);
}