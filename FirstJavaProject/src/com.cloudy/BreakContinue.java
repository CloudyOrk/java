package com.cloudy;
public class BreakContinue {
  public static void main(String[] args){
    // break
    for (int i=0; i<5 ; i++){
      System.out.println(i);
      System.out.println("Great day!");
      if(i==2){
        System.out.println("Ending the loop");
        break;
      }
    }
    System.out.println("Loop ends here");

    int a=0;
    while(a<5) {
      System.out.println(a);
      System.out.println("Great day!");
      if(a==2){
        System.out.println("Ending the loop");
        break;
      }
      a++;
    }
    System.out.println("Loop ends here");

    int b=0;
    do{
      System.out.println(b);
      System.out.println("Great day!");
      if(b==2){
        System.out.println("Ending the loop");
        break;
      }
      b++;
    }while(b<5);
    System.out.println("Loop ends here");




    // continue
    for (int c=0; c<5 ; c++){
      if(i==2){
        System.out.println("Ending the loop");
        continue;
      } 
        System.out.println(c);
        System.out.println("Great day!");
    }
    System.out.println("Loop ends here");

     for (int c=0; c<5 ; c++){
      if(i==2){
        System.out.println("Ending the loop");
        continue;
      } 
        System.out.println(c);
        System.out.println("Great day!");
    }
    System.out.println("Loop ends here");


     int d=0;
    do{
      d++;
      if(b==2){
        System.out.println("Ending the loop");
        break;
      }
      System.out.println(d);
      System.out.println("Great day!");
      
    }while(d<5);
    System.out.println("Loop ends here");
  }
}
    
