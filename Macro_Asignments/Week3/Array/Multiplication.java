import java.util.Scanner;

class Multiplication{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int mul=0;
    System.out.println("Enter number");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      mul=n*i;
      if(mul%n==0)
        System.out.println(n+"*"+i+"="+mul);
    }
  }
}