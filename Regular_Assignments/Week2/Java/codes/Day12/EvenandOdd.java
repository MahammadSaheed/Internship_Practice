import java.util.Scanner;

class EvenandOdd {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    n = sc.nextInt();
    System.out.println("even numbers");
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    System.out.println(" odd numbers");
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}