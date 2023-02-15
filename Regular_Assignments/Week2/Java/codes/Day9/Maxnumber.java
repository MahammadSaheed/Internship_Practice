import java.util.Scanner;

class Maxnumber {
  public static void main(String args[]) {
    int firstnumber, secondnumber;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int fnumber = sc.nextInt();
    System.out.println("Enter the second number");
    int snumber = sc.nextInt();
    if (fnumber > snumber) {
      System.out.println("first number is maximum");
    } else {
      System.out.println("second number is greater");
    }
  }
}