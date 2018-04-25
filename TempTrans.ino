/* 
2.* Arduino Wireless Communication Tutorial 
3.*     Example 1 - Transmitter Code 
4.*                 
5.* by Dejan Nedelkovski, www.HowToMechatronics.com 
6.*  
7.* Library: TMRh20/RF24, https://github.com/tmrh20/RF24/ 
8.*/ 
 
#include <SPI.h> 
#include <nRF24L01.h> 
#include <RF24.h> 

int sensorInput;
double temp;
 
RF24 radio(9, 10); // CE, CSN 
 
const byte address[6] = "00001"; 
 
void setup() { 
  radio.begin(); 
  radio.openWritingPipe(address); 
  radio.setPALevel(RF24_PA_MIN); 
  radio.stopListening(); 
} 

void loop() {
  sensorInput = analogRead(A0);    //read the analog sensor and store it
  temp = (double)sensorInput / 1024;       //find percentage of input reading
  temp = temp * 5;                 //multiply by 5V to get voltage
  temp = temp - 0.5;               //Subtract the offset 
  temp = temp * 100;
  String d = double.toString(temp);
  
  
   char text[4] = {d.charAt(0), d.charAt(1), d.charAt(2), d.charAt(3)};
//  const char text[] = "Hello World"; 
  radio.write(&text, sizeof(text)); 
  delay(1000); 
} 

