import java.util.Scanner;

class Greaterthan {
  static int maxNumber(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }

  public static void main(String args[]) {
    int max = Greaterthan.maxNumber(23, 17);
    System.out.println(max);
  }
}