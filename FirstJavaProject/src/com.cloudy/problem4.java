package com.cloudy;
import java.util.Scanner;
public class problem4{
  public static void main(String[] args){
    // 1 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if ( num == 20 ) {
      System.out.println("Corrwct number");
    }
    else {
      System.out.println("Wrong  number");
    }

    // 2
    System.out.print("Enter marks in subject 1");
    int subject1 = sc.nextInt();
    System.out.print("Enter marks in subject 2");
    int subject2 = sc.nextInt();
    System.out.print("Enter marks in subject 3");
    int subject3 = sc.nextInt();
    float total = (subject1.0f+subject2.0f+subject3.0f+);
    float percentage = (total / 3.0f);
    if (percentage>=40 && subject1>=33 && subject3>=33 && subject2>=33){
      System.out.format("You are qualified \n Total marks: %total / 300 \n Percentage: %percentage");
    }
    else if (subject1<33){
      System.out.format("You are not qualified \n Total marks: %total / 300 \n Percentage: %percentage \n You failed in subject 1");
    }
    else if (subject2<33){
      System.out.format("You are not qualified \n Total marks: %total / 300 \n Percentage: %percentage \n You failed in subject 2");
    }
    else if (subject3<33){
      System.out.format("You are not qualified \n Total marks: %total / 300 \n Percentage: %percentage \n You failed in subject 3");
    }
    else {
      System.out.format("You are not qualified \n Total marks: %total / 300 \n Percentage: %percentage \n You couldnt score minimum of 40% marks");
    }

    // 3
    System.out.print("Enter your annual income");
    int income = sc.nextInt();
    float tax = 0.0f;
    
    if (income>=250000 && income<500000){
      tax = tax + 0.05f * ( income - 250000 );
      System.out.format("You have to pay %tax tax on your income");
    }
    else if (income>=500000 && income<1000000){
      tax = tax + 0.20f * ( income - 500000 );
      tax = tax + 0.05f * ( 250000 );
      System.out.format("You have to pay %tax tax on your income");
    }
    else if (income>=1000000){
      tax = tax + 0.05f * ( 250000 );
      tax = tax + 0.20f * ( 500000 );
      tax = tax + 0.30f * ( income - 1000000 );
      System.out.format("You have to pay %tax tax on your income");
    }
    else{
      tax = tax + 0;
      System.out.format("You have to pay %tax tax your income");
    }


    // 4
    System.out.println("Enter the day"):
    int day = sc.nextInt();
    switch (day){
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
    }

    // 5 
    System.out.println("Enter the year");
    int year = sc.nextInt();
    if ( year == 0 && year % 100 != 0) || (year % 400 == 0) {
      System.out.format("Yes, the year %year is a leap year");
    }
    else {
      System.out.format("No, the year %year is not a leap year");
    }
  }
}
    
        
     

    
    
    
    
