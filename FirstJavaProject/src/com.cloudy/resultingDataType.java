package com.cloudy;
import java.util.Scanner;
public class resultingDataType{
  public static void main(String[] args){
    int a = 5+5;
    byte x = 5;
    float b = 4.66f + a + x;
    System.out.println(b);
      // b = byte            R = b + s -> int
    // s = short           R = s + i -> int
    // i = integer         R = l + f -> float
    // l = long            R = i + f -> float
    // f = float           R = c + i -> int
    // d = double          R = c + s -> int
    // c = character       R = l + d -> double 
    //                     R = f + d -> double
 }
} 

  
