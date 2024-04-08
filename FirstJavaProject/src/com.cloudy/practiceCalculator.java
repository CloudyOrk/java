package com.cloudy;
import java.util.Scanner;
public class practiceCalculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your subject 1 marks: ");
    float subject1 = sc.nextFloat();
    System.out.print("Enter your subject 2 marks: ");
    float subject2 = sc.nextFloat();
    System.out.print("Enter your subject 3 marks: ");
    float subject3 = sc.nextFloat();
    System.out.print("Enter your subject 4 marks: ");
    float subject4 = sc.nextFloat();
    System.out.print("Enter your subject 5 marks: ");
    float subject5 = sc.nextFloat();
    float total = (subject1 + subject2 + subject3 + subject4 + subject5);
    float percentage = total/500*100;
    System.out.print("Your percentage is: " + percentage);
  }
} 

    

    
    
   
