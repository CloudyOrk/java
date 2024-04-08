package com.cloudy;
public class precedenceOperator{
  public static void main(String[] args){
    int aa = 5*5-2021/21; 
    // 30-2021/21
    // 30-96
    // -66
    
    int bb = 5/5-2021*21; 
    // 1-2021*21
    // 1-42441
    // -42440
   
    System.out.println(aa);
    System.out.println(bb);
    // Precedence * = / > - > 
    // Associativity left to right <- varies 
    
    int x = 5;
    int y = 5;
    lnt k = x * y / 2;
    System.out.println(k);

    int b = 4;
    int c = 2;
    int a = 8;
    int quad = (b*b-4*a*c)/(2*a);
    System.out.println(quad);
      
      
  }
}
