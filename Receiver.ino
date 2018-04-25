/* 
2.* Arduino Wireless Communication Tutorial 
3.*       Example 1 - Receiver Code 
4.*                 
5.* by Dejan Nedelkovski, www.HowToMechatronics.com 
6.*  
7.* Library: TMRh20/RF24, https://github.com/tmrh20/RF24/ 
8.*/ 

#include <SPI.h> 
#include <nRF24L01.h> 
#include <RF24.h> 
 
RF24 radio(9, 10); // CE, CSN 
 
const byte address[6] = "00001"; 
 
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
    Serial.println(text); 
  } 
}

