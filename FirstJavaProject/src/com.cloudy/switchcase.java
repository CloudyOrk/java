package com.cloudy;
import java.util.Scanner;
public class switchcase {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age");
    int age = sc.nextInt();
    // if else if ladder 
    if (age>50) {
      System.out.println("You're experienced");
    }
    else if (age>40) {
      System.out.println("You're semi-experienced");
    }
    else if (age>35) {
      System.out.println("You're semi-semi-experienced");
    }
    else {
      System.out.println("You're not experienced");
    }

    // switch case 1
    switch(age){
      case 18:
        System.out.println("You're an adult now!");
        break;
      case 25:
        System.out.println("You're semi experienced");
        break:
      case 30:
        System.out.println("You're experienced");
        break;
      default:
        System.out.println("Enjoy!!");
    }
    System.out.println("Thank you for using this script");

    // switch case 2
    char var = "r";
    switch(var){
      case "r":
        System.out.println("You're an adult now!");
        break;
      case "s":
        System.out.println("You're semi experienced");
        break:
      case "t":
        System.out.println("You're experienced");
        break;
      default:
        System.out.println("Enjoy!!");
    }
    System.out.println("Thank you for using this script");

    // enhanced switch case 1
    String var1 = "cloudyork";
    switch(var){
      case "cloudy" -> {
        System.out.println("You're an adult now!");
        System.out.println("You're semi experienced");
      }
      case "cloudyork" -> System.out.println("You're semi experienced");
      case "ani" -> System.out.println("You're experienced");
      default -> System.out.println("Enjoy!!");
    }
    System.out.println("Thank you for using this script");
    

  }
}

