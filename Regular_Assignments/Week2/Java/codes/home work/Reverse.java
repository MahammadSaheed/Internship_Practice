import java.util.Scanner;

class Reverse{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num, rev=0;  
    num=sc.nextInt();
    
while(num != 0)   
{  
int remainder = num % 10;  
rev = rev * 10 + remainder;  
num = num/10;  
}  
System.out.println("The entered number is : " + rev);  
}  
}
