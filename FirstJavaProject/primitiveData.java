package com.company;
public class primitveData {
  public static void primitive(String[] args){
    byte Variable1 = 8;
    // range -128 to 127 [ -(2^8)/2 to (2^8)/2-1 ] 
    // 1 byte
    
    short Variable2 = 129;
    // range -(2^16)/2 to (2^16)/2-1 
    // 2 byte

    int Variable3;
    // range -(2^32)/2 to (2^32)/2-1 
    // 4 byte
    
    float Variable4;
    // range depends 
    // 4 byte
    // default value 0.0f

    long Variable5;
    // range -(2^64)/2 to (2^64)/2-1 
    // 8 byte

    double Variable6;
    // range depends
    // 8 byte
    // default value 0.0d

    char Variable7;
    // range 0 to 65535(2^16-1)
    // 2 byte
    // supports unicode
    // Default value \u0000

    int num1 = 5;
    int num2 = 5;
    int num3 = 2;
    int num4 = 1;
    int sum = num1 + num2 + num3 + num4;
    System.out.println("The sum of numbers is: ", sum);
  }
}
    
    
    
  
