import java.util.Scanner;

class Subtract {
  public static void main(String args[]) {
    int a[][] = { { 2, 1,3 }, { 7, 4,4 },{4,7,3} };
    int b[][] = { { 4, 5,4 }, { 9, 8,9 },{2,1,3} };
    int c[][] = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = a[i][j] - b[i][j];
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
      }
    }
  }
