import java.util.Scanner;
import java.lang.Math;

class Calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double num1, num2;
    System.out.println("enter the numbers");
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    System.out.println("enter the operatore (+,-,*,/)");
    String operator = sc.next();
    double sum = 0;
    if (operator.equals("+")) {
      sum = num1 + num2;
      System.out.println("SUM=" + sum);
    } else if (operator.equals("-")) {
      sum = num1 - num2;
      System.out.println("SUM=" + sum);
    } else if (operator.equals("*")) {
      sum = num1 * num2;
      System.out.println("SUM=" + sum);
    } else if (operator.equals("/")) {
      sum = num1 / num2;
      System.out.println("SUM=" + sum);
    } else {
      System.out.println("invalid input ");
    }
  }
}