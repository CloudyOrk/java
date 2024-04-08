package com.cloudy;
import java.util.Scanner;
public class aboutStringMethods{
  public static void main(String[] args){
    String name = "Cloudy";
    System.out.println(name);
    
    // string length
    int value = name.length();
    System.out.println(value);
    
    // string lower case replace
    String name2 = "ClOuDyOrK";
    String lowercasestr = name2.toLowerCase();
    System.out.println(lowercasestr);

    // string upper case replace
    String name3 = "ClOuDyOrK";
    String uppercasestr = name3.toUpperCase();
    System.out.println(lowercasestr);

    // string trim
    String name4 = "     ClOuDyOrK       ";
    String trimmedStr = name4.trim();
    System.out.println(trimmedStr);

    // string substring(int)
    String name5 = "ClOuDyOrK";
    String subStr1 = name5.substring(4); // index starts from 0
    System.out.println(subStr1);
    String subStr2 = name5.substring(1, 6); // excludes the ending index
    System.out.println(subStr2);

    
    // string replace
    String name6 = "ClOuDyporK";
    String newStr1 = name6.replace("p", "c"); 
    System.out.println(newStr1);
    String newStr2 = name6.replace("pork", "ork");
    System.out.println(newStr2);

    // string startswith
    String name7 = "ClOuDyporK";
    String startswithStr1 = name6.startswith("Cl");  // returns true
    System.out.println(startswithStr1);
    String startswithStr2 = name6.startswith("ork"); // returns false
    System.out.println(startswithStr2);

    // string charAt(int)
    String name8 = "ClOuDyporK";
    String charAtStr1 = name6.charAt(3);  // returns u
    System.out.println(charAtStr1);
    String charAtStr2 = name6.charAt(0); // returns c
    System.out.println(charAtStr2);

    // string endswith
    String name9 = "ClOuDyporK";
    String endswithStr1 = name6.endswith("Cl");  // returns false
    System.out.println(endswithStr1);
    String endswithStr2 = name6.endswith("ork"); // returns true
    System.out.println(endswithStr2);

    

    
    
 
    
  }
  
}
