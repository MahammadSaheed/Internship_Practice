import java.util.Scanner;

class Sumofdigit{
    public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int product=1;
    int digit;
    System.out.println("enter number");
    int num=sc.nextInt();
    do
    {
      digit=num%10;
      product=product*digit;
      num=num/10;
    }while(num>0);
    System.out.println("Product of digits="+product);
  }
}
}