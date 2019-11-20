#include <Arduino.h>

int analogPin = 2;     // potentiometer wiper (middle terminal) connected to analog pin 3

                       // outside leads to ground and +5V

int val = 0;           // variable to store the value read



void setup()

{

  Serial.begin(9600);          //  setup serial

}



void loop()

{

  val = analogRead(analogPin);    // read the input pin
  delay(100);
  Serial.println(val);             // debug value

}
