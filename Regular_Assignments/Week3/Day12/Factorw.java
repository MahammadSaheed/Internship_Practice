import java.util.Scanner;

class Factorw{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    int i=1;
    while(i<=n/2){
      if(n%i==0){
        System.out.println(i);
       
      }
      i++;
    }
  }
}