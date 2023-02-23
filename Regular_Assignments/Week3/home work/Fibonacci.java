import java.util.Scanner;

class Fibonacci {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n, firstterm, secondterm;
    System.out.println("enter the n value");
    n = sc.nextInt();
    System.out.println("enter the first term");
    firstterm = sc.nextInt();
    System.out.println("enter the second term");
    secondterm = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println(firstterm + ",");
      int nextterm = firstterm + secondterm;
      firstterm = secondterm;
      secondterm = nextterm;
    }
  }
}