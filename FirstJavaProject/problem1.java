package com.cloudy;
import java.util.Scanner;
public class problem1{
  public static void main(String[] args){
    // 1
    int a = 5;
    int b = 5;
    int c = 5;
    int d = 5;
    int sum = a+b+c+d;
    System.out.println(sum);

    // 2
    float subject1 = 39f;
    float subject2 = 49f;
    float subject3 = 76f;
    float cgpa = (subject1+subject2+subject3)/30;
    System.out.println(cgpa);

    // 3
    Scanner aa = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String str = aa.next();
    System.out.println("Hello" + str + ", have a good day!");

    // 4, convert kmph to mph
    System.out.println("Enter value");
    float kmph = aa.nextFloat();
    float mph = kmph/1.609;
    System.out.println(kmph + "kmph is " + mph + "mph");

    // 5
    System.out.println("Enter number");
    Scanner inn = new Scanner(System.in);
    System.out.println(inn.hasNextInt());
      
      }
}
