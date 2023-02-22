import java.util.Scanner;

class Integar{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number,digit;
    int sum=0;
    number = sc.nextInt();    
     while(number > 0)  
     {      
    digit = number % 10;  
    sum = sum + digit; 
    number = number / 10;  
}   
    System.out.println("Sum of Digits: "+sum);  
  }
}   