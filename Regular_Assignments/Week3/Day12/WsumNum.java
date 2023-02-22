import java.util.Scanner;

class WsumNum {
  public static void main(String args[]) {
    int n, sum = 0;
    System.out.println("enter the value");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int i = 0;
    while (i <= n) {
      i = i + 2;
      sum = sum + i;

      i++;
    }
    System.out.println("sum" + sum);
  }
}