import java.util.Scanner;

class Demo {
  public static void main(String args[]) {
    int a[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();

    }
  }
}