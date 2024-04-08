package com.cloudy;
import java.util.Scanner;

public class userInput {
  public static void main(String[] args){
    Scanner aa = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = aa.nextInt();
    System.out.println("Enter second number: ");
    int b = aa.nextInt();
    int sum = a + b;
    System.out.print("The sum of these numbers is ");
    System.out.print(sum);
  }
}
     
      
