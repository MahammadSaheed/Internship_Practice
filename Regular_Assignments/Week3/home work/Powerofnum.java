import java.util.Scanner;

class Powerofnum{
  public static void main(String args[]){
   Scanner sc=new Scanner (System.in);
    int exponent,base;
    long result=1;
     System.out.println("enter the base");
    base =sc.nextInt();
    System.out.println("Enter the exponent");
    exponent=sc.nextInt();
    while(exponent!=0){
      result=result*base;
      exponent--;
    }
    System.out.println("the answer is ="+result);
  }
}