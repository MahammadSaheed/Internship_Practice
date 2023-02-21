import java.util.Scanner;

class Sumoflastandfirstdigit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = sc.nextInt();
    int Ld = number % 10;
    int Fd = number;
    while (Fd >= 10) {
      Fd = Fd / 10;
    }
    System.out.println("Sum=" + (Fd + Ld));
  }
}