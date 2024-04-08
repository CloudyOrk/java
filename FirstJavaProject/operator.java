package com.cloudy;
import java.util.Scanner;
public class operator{
  public class void main(String[] args){
    // arithmetic and assignment operators
    int a = 4;
    int b = 6+a; //6-a, 6*a, 6%a <- remainder 
    b += 3;
    b *= 6;
    System.out.println(b);
    
    // comparison operators 
    System.out.println(6==8);
    System.out.println(6==6);
    System.out.println(b<8);
    System.out.println(b>0);

    // logical operators
    System.out.println(64>5 && 65>8); // (&& and ) overall false if one is false
    System.out.println(64>10 || 64>100); // (|| or) overall true if one is true

    // bitwise operator
    System.out.println(2&3);
    //   10
    //   11
    //  -----
    //   10
    //  -----
      
  }
}
