import java.util.Scanner;

class NtoOne {
  public static void main(String args[]) {
    int n;
    System.out.println("enter the n value");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int i = n;
    while (i >= 1) {
      System.out.print(i);
      i--;
    }
  }
}