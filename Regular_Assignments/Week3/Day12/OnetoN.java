import java.util.Scanner;

class OnetoN{
  public static void main(String args[]){
    int n;
    System.out.println("enter the n value");
    Scanner sc=new Scanner (System.in);
    n=sc.nextInt();
    int i=1;
    while(i<=n){
      System.out.println(i);
      i++;
    }
  }
}