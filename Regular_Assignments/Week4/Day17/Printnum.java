import java.util.Scanner;

class Printnum {
  static void maxNumber(int num1, int num2) {
    if (num1 > num2) {
      System.out.println("then num 1 is bigger");
    } else {
      System.out.println("then num2 is bigger");
    }
  }

  public static void main(String args[]) {
    Printnum.maxNumber(23, 17);
  }
}