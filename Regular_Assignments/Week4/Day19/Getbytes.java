import java.util.Scanner;
class Getbytes{
   static void getBytes(String s1){    
    byte[] b=s1.getBytes();  
    for(int i=0;i<b.length;i++){ 
       System.out.println(""+b[i]); 
    }
   }
  public static void main(String args[]){
    System.out.println("enter the String");  
     getBytes("noone");
    }
  }