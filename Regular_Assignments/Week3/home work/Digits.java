import java.util.Scanner;

class Digit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int digit;
    System.out.println("enter the  number");
    int num = sc.nextInt();
    do {
      digit = num % 10;
      sum = sum + digit;
      num = num / 10;
    } while (num > 0);
    System.out.println("the  d igits="+sum);
  }
}
