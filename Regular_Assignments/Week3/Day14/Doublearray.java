import java.util.Scanner;

class Doublearray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double arr[] = new double[5];
    System.out.println("enter the values");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextDouble();
    }
  }
}