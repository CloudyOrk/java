package com.company;
public class primitveData {
  public static void main(String[] args){
    byte age = 18;
    System.out.println(age);
    // range -128 to 127 [ -(2^8)/2 to (2^8)/2-1 ] 
    // 1 byte
    
    short age1 = 18;
    System.out.println(age1);
    // range -(2^16)/2 to (2^16)/2-1 
    // 2 byte

    int age2 = 18;
    // range -(2^32)/2 to (2^32)/2-1 
    // 4 byte
    
    float f1 = 18.4f;
    // range depends 
    // 4 byte
    // default value 0.0f

    long ageCloudy = 9999999999L;
    // range -(2^64)/2 to (2^64)/2-1 
    // 8 byte

    double d1 = 18.88D;
    // range depends
    // 8 byte
    // default value 0.0d

    char ch = 'A';
    // range 0 to 65535(2^16-1)
    // 2 byte
    // supports unicode
    // Default value \u0000

    boolean a = true;
    // size depends on JVM

    String str = "CLOUDYORK";
    System.out.println(str);

    int num1 = 5;
    int num2 = 5;
    int num3 = 2;
    int num4 = 1;
    int sum = num1 + num2 + num3 + num4;
    System.out.println("The sum of numbers is: ", sum);
  }
}
    
    
    
  
