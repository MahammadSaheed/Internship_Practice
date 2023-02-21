import java.util.Scanner;

class Firstandlast{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
   int num=sc.nextInt();
    int ld=num%10;
    int fd=num;
    while(fd>=10){
      fd=fd/10;
    }
    System.out.println("The first digit:"+fd);
     System.out.println("The last digit:"+ld);
  }
}