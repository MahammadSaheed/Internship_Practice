import java.util.Scanner;

class Divisibleby5 {
  public static void main(String args[]) {
    int a[][] = { { 12, 3, 43 }, { 35, 90, 78 }, { 32, 21, 44 } };
    int rem = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (a[i][j] % 5 == 0) {
          System.out.print(a[i][j] + " ");
        }
      }
      System.out.println();
    }

  }
}
