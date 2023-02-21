import java.util.Scanner;

class Factor {
  public static void main(String args[]) {
    int n;
    System.out.println("enter the value");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);

      }
    }
  }
}