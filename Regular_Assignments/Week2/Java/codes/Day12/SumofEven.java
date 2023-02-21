import java.util.Scanner;

class SumofEven{
  public static void main(String args[]){
    int sum=0,n;
    System.out.println("enter the n number");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    for (int i=0;i<=n;i=i+2){
      sum=sum+i;
    }
    System.out.println("the sum of even number:" +sum);
  }
}