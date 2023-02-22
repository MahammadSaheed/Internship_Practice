import java.util.Scanner;


class Armstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value");
    int num = sc.nextInt();
    int reminder = 0, result = 0;
    int originalnumber = num;
    while (num != 0) {
      reminder = num % 10;
      result = result + (int) Math.pow(reminder, 3);
      num = num / 10;
    }
    if (originalnumber == result) {
      System.out.println("Amstrong number");
    } else {
      System.out.println("not a amstrong number");
    }
  }
}