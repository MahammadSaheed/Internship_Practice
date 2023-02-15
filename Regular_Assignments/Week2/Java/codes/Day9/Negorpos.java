import java.util.Scanner;

class Negorpos {
  public static void main(String args[]) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    number = sc.nextInt();
    if (number > 0) {
      System.out.println("The entered value is positive");
    } else if (number < 0) {
      System.out.println("the entered value is negative ");
    } else {
      System.out.println("here it is empty");
    }
  }
}