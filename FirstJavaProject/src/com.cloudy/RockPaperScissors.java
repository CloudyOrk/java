package com.cloudy;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    // 0 - Rock
    // 1 - Paper
    // 2 - Scissor
    System.out.println("Play Rock Paper and Scissor!\nWhat do you choose?\n 0 - Rock\n 1 - Paper \n 2 - Scissor "
    Int user_input = sc.next();
    if(rnd == user_input) {
      System.out.format("Draw!, Computer chose %rnd");
    }
    else if(rnd == 0 && user_input == 1) {
      System.out.format("You won!, Computer chose %rnd");
    }
    else if(rnd == 0 user_input == 2) {
      System.out.format("You lost!, Computer chose %rnd");
    } 
    else if(rnd == 1 && user_input == 0 ) {
      System.out.format("You lost!, Computer chose %rnd");
    }
    else if(rnd == 1 user_input == 2) {
      System.out.format("You won!, Computer chose %rnd");
    } 
    else if(rnd == 2 && user_input == 0) {
      System.out.format("You won!, Computer chose %rnd");
    }
    else if(rnd == 0 user_input == 1) {
      System.out.format("You lost!, Computer chose %rnd");
    }
    else {
      System.out.println("Invalid input!");
    }
  } 
} 
     
    
    
    
