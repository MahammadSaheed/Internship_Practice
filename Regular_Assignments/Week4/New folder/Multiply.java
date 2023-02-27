import java.util.Scanner;

class Multiply {
  public static void main(String args[]) {
    int a[][] = { { 2, 1, 3 }, { 3, 4, 5 }, { 2, 1, 2 } };
    int b[][] = { { 3, 1, 4 }, { 3, 4, 1 }, { 4, 3, 9 } };
    int c[][] = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = 0;
        for (int k = 0; k < 3; k++) {
          c[i][j] = a[i][k] * b[k][j];
        }
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}