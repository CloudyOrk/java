package com.cloudy;
import java.util.Scanner;
public class logicaloperators {
  public static void main(String[] args) {
    // logical operators
    // AND (&&)
    boolean a = true;           //  1 0 = 0
    boolean b = false;          //  1 1 = 1
    if(a && b) {                //  0 1 = 0
      System.out.println("1");  //  0 0 = 0
    }
    else{
      System.out.println("0");
    }
    
    // OR (||)
    boolean c = true;           //  1 1 = 1
    boolean d = false;          //  1 0 = 1
    if(c && d) {                //  0 1 = 1
      System.out.println("1");  //  0 0 = 0
    }
    else{
      System.out.println("0");
    }
    
    // NOT (!var)
    boolean e = true;           //  !1 = 0
    boolean f = false;          //  !0 = 1   
    System.out.print("Not(e) is: ");  
    System.out.println(!e);
    System.out.print("Not(f) is: ");  
    System.out.println(!f);
  }
}
