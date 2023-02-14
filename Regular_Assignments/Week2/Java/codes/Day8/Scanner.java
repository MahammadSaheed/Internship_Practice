import java.util.Scanner;

class Hello {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number1");
    int num1 = sc.nextInt();
    System.out.println("enter number 2");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println("the sum of number is " + sum);
  }
}