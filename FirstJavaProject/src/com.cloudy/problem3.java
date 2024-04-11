package com.cloudy;
import java.util.Scanner;
public class problem3 {
  public static void main(String[] args){
    // 1
    String name = "CLoUDyORK";
    name = name.toLowerCase();
    System.out.println(name);

    // 2
    String text = "cloudy ork 5555";
    text = text.replace(" ", "_");
    System.out.println(text);

    // 3
    String letter = "Dear <|name|>, Thanks a lot!";
    letter = letter.replace("<|name|>", "cloudyork");
    System.out.println(letter);

    // 4
    String letter1 = "T ha  nks  a   lot!";
    System.out.println(letter1.indexOf("  "));
    System.out.println(letter1.indexOf("   "));

    // 5
    String letter2 = "Dear Cloudyork, \n\t This is nice. \n\tThanks!";
    System.out.println(letter2);

    

    
    
