/* Receiver.ino
2.* Arduino Wireless Communication Tutorial 
3.*       Example 1 - Receiver Code 
4.*                 
5.* by Dejan Nedelkovski, www.HowToMechatronics.com 
6.*  Modified by Kyle Stubler
7.* Library: TMRh20/RF24, https://github.com/tmrh20/RF24/ 
8.*/ 

#include <SPI.h> 
#include <nRF24L01.h> 
#include <RF24.h> 
 
RF24 radio(9, 10); // CE, CSN 
int timeH = 23;
int timeM = 07;
int timeS = 20;
 
const byte address[6] = "34568"; 
 
void setup() { 
  Serial.begin(9600); 
  radio.begin(); 
  radio.openReadingPipe(0, address); 
  radio.setPALevel(RF24_PA_MIN); 
  radio.startListening(); 
} 
 
void loop() { 
  if (radio.available()) { 
    char text[32] = ""; 
    radio.read(&text, sizeof(text)); 
    Serial.println("________________________________");
    Serial.print("Time "); Serial.print(timeH); Serial.print(":");
    Serial.print(timeM); Serial.print(":");
    Serial.println(timeS);
    
    Serial.print(text); 
    Serial.println(" degrees Celsius");

    timeS = timeS + 10;
    if(timeS == 60){
      timeM = timeM+1;
      timeS = 0;
    }
    if(timeM == 60){
      timeH = timeH+1;
      timeM = 0;
      timeS = 0;
    }
  } 
}
