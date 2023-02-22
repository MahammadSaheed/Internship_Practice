import java.util.Scanner;

class Divisibleby5 {
  public static void main(String args[]) {
    int n, i;
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (i = 0; i <= n; i = i + 5) {
      if (i % 5 == 0) {
        System.out.println(i);
      }
    }
  }
}