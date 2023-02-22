import java.util.Scanner;

class Primenumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    int count = 0;
    for (int i = 2; i <= num / 2; i++) {
      if (num % 1 == 0) {
        count++;
        break;
      }
    }

    if (count == 0)
      System.out.println("its prime number");
    else
      System.out.println("its not a prime number");
  }
}
