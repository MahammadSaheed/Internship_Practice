import java.util.Scanner;

class Sum {
  public static void main(String args[]) {
    int n, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println("sum of n numbers:" + sum);
  }

}