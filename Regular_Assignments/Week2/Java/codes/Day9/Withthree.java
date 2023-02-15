import java.util.Scanner;

class Withthree {
  public static void main(String args[]) {
    int num1, num2, num3;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int fnum = sc.nextInt();
    System.out.println("enter the second number");
    int snum = sc.nextInt();
    System.out.println("ente the third number");
    int tnum = sc.nextInt();
    if ((fnum > snum) && (fnum > tnum))
      System.out.println("num1 is the greater");
    else if ((snum > fnum) && (snum > tnum))
      System.out.println("num2 is greater");
    else
      System.out.println("num3 is greater");

  }
}