package com.cloudy;
import java.util.Scanner;
public class aboutstrings{
  public static void main(String[] args){
    // strings cannot be changed
    String name = new String(original: "cloudy");
    String Name = "cloudy";
    System.out.println(name);
    System.out.println(Name);
    int a = 5;
    float b = 5.521f;
    System.out.printf("The value of a is %d and value of b is %f and the name is %s", a, b, name); // %.2f and %8.2f
    System.out.format("The value of a is %d and value of b is %f and the name is %s");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(str);
  }
}
