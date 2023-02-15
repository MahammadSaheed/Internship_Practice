import java.util.Scanner;

class Divisibleby5 {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    n= sc.nextInt();
    if (n% 5 == 0) {
      System.out.println("It is divisible by 5");
    } else {
      System.out.println("its is not divisible by 5");
    }
  }
}