import java.util.Scanner;

class Sumofodd {
  public static void main(String args[]) {
    int sum = 0, n;
    System.out.println("enter the n number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (int i = 1; i <= n; i = i + 2) {
      sum = sum + i;
    }
    System.out.println("the sum of odd number:" + sum);
  }
}