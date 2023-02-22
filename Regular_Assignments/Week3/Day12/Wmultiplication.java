import java.util.Scanner;

class Wmultiplication {
  public static void main(String args[]) {
    int sum = 0, n;
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int i = 1;
    while (i <= 10) {
      System.out.println(n + "*" + i + "=" + (n * i));
      i++;
    }

  }
}