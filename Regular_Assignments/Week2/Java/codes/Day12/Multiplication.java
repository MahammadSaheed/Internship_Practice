import java.util.Scanner;

class Multiplication{
  public static void main(String args[]){
    int n,i,sum=0;
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
    for(i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*1));
    }
  }
}