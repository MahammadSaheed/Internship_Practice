import java.util.Scanner;

class Sum {
  public static void main(String args[]) {
    int a[][] = { { 12, 3, 43 }, { 35, 90, 78 }, { 32, 21, 44 } };
    int sum = 0, count = 0;
    for (int i = 0; i < 3; i++) {
      sum = 0;
      for (int j = 0; j < 3; j++) {
        sum = a[i][j] + sum;
      }
      System.out.println(sum);
    }
  }
}