import java.util.Scanner;

class Wdivisibleby5{
  public static void main(String args[]){
    int n,i;
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    i=5;
    while(i<=n){
      if(i%5==0){
    System.out.println(i);
        i=i+5;
      }
      
    }
  }
}